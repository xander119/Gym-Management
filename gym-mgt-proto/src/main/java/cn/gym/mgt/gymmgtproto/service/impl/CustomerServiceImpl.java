package cn.gym.mgt.gymmgtproto.service.impl;

import cn.gym.mgt.gymmgtproto.dto.CustomerRequestBody;
import cn.gym.mgt.gymmgtproto.mbg.mapper.CustomerMapper;
import cn.gym.mgt.gymmgtproto.mbg.mapper.CustomerMembershipMapper;
import cn.gym.mgt.gymmgtproto.mbg.mapper.SecurityUserMapper;
import cn.gym.mgt.gymmgtproto.mbg.model.Customer;
import cn.gym.mgt.gymmgtproto.mbg.model.CustomerExample;
import cn.gym.mgt.gymmgtproto.mbg.model.SecurityUser;
import cn.gym.mgt.gymmgtproto.mbg.model.SecurityUserExample;
import cn.gym.mgt.gymmgtproto.service.CustomerService;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    SecurityUserMapper securityUserMapper;
    @Autowired
    CustomerMembershipMapper customerMembershipMapper;


    @Override
    public List<Customer> allCustomers(CustomerRequestBody customerRequestBody) {
        PageHelper.startPage(customerRequestBody.getPageNum(), customerRequestBody.getPageSize());
        CustomerExample customerExample = new CustomerExample();
        if (StrUtil.isNotBlank(customerRequestBody.getUsername())) {
            SecurityUserExample securityUserExample = new SecurityUserExample();
            securityUserExample.createCriteria().andUsernameEqualTo(customerRequestBody.getUsername());
            List<SecurityUser> securityUsers = securityUserMapper.selectByExample(securityUserExample);
            List<Long> securityUserIdList = securityUsers.stream().map(SecurityUser::getSecurityUserId).collect(Collectors.toList());

            customerExample.createCriteria().andSecurityUserIn(securityUserIdList);
        }
        if (StrUtil.isNotBlank(customerRequestBody.getSecurityUserId())) {
            customerExample.createCriteria().andSecurityUserEqualTo(Long.valueOf(customerRequestBody.getSecurityUserId()));
        }
        return customerMapper.selectByExample(customerExample);
    }

    @Override
    public Customer customerById(Long customerId) {
        if (customerId != null) {
            return customerMapper.selectByPrimaryKey(customerId);
        }
        return null;
    }

    @Override
    public Customer customerBySecurityUserId(Long securityUserId) {
        if (securityUserId != null) {
            CustomerExample customerExample = new CustomerExample();
            customerExample.createCriteria().andSecurityUserEqualTo(securityUserId);
            List<Customer> customers = customerMapper.selectByExample(customerExample);

            return customers.isEmpty() ? null : customers.get(0);
        }
        return null;
    }

    @Override
    public Integer createCustomer(Customer customer, Long securityUserId) {
        customer.setSecurityUser(securityUserId);
        return customerMapper.insert(customer);
    }

    @Override
    public int updateCustomer(Long customerId, Customer customer) {
        customer.setCustomerId(customerId);
        return customerMapper.updateByPrimaryKeySelective(customer);
    }
}
