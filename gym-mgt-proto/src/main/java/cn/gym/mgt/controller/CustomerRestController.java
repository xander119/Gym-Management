package cn.gym.mgt.controller;

import cn.gym.mgt.comon.ResponseCustom;
import cn.gym.mgt.dao.MembershipCustomerMapperDao;
import cn.gym.mgt.dto.CustomerRequestBody;
import cn.gym.mgt.dto.MembershipCRUD;
import cn.gym.mgt.dto.SecurityUserSearchBody;
import cn.gym.mgt.mbg.mapper.CustomerMembershipMapper;
import cn.gym.mgt.mbg.mapper.MembershipMapper;
import cn.gym.mgt.mbg.model.Customer;
import cn.gym.mgt.mbg.model.CustomerMembership;
import cn.gym.mgt.mbg.model.Membership;
import cn.gym.mgt.mbg.model.SecurityUser;
import cn.gym.mgt.service.CustomerService;
import cn.gym.mgt.service.SecurityUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRestController.class);

    @Autowired
    CustomerService customerService;

    @Autowired
    SecurityUserService securityUserService;

    @Autowired
    CustomerMembershipMapper customerMembershipMapper;

    @Autowired
    MembershipMapper membershipMapper;
    @Autowired
    MembershipCustomerMapperDao membershipCustomerMapperDao;

    @PostMapping("/list")
    public ResponseCustom<List<Customer>> getListCustomer(@RequestBody CustomerRequestBody customerRequestBody, BindingResult result) {
        return ResponseCustom.success(customerService.allCustomers(customerRequestBody));
    }

    @PostMapping("/addMembership")
    @ApiOperation("添加用户会员")
    public ResponseCustom<Membership> addMembership(@RequestBody MembershipCRUD membershipCRUD, BindingResult result) {
        ResponseCustom<Membership> membershipResponseCustom;
        Membership membership = new Membership();
        BeanUtils.copyProperties(membershipCRUD, membership);
        if (membershipCRUD.getCustomerId() != null) {
            Customer customer = customerService.customerById(membershipCRUD.getCustomerId());
            Long membershipId = -1L;
            int count = 0;
            if (customer != null) {
                membershipId = membershipCustomerMapperDao.insertMembership(membership);
            }
            if (membershipId != -1L) {
                CustomerMembership customerMembership = new CustomerMembership();
                customerMembership.setCustomerId(customer.getCustomerId());
                customerMembership.setMembershipId(membershipId);
                count = customerMembershipMapper.insert(customerMembership);
            }
            if (count == 1) {
                membershipResponseCustom = ResponseCustom.success(membership);
                LOGGER.debug("Add membership success:{}", membershipCRUD);
            } else {
                membershipResponseCustom = ResponseCustom.failed("操作失败");
                LOGGER.debug("Add membership failed:{}", membershipCRUD);
            }
        } else {
            membershipResponseCustom = ResponseCustom.failed("操作失败");
            LOGGER.debug("Add membership failed:{}", membershipCRUD);
        }
        return membershipResponseCustom;
    }


    @PostMapping("/search")
    @ApiOperation("搜索用户")
    public ResponseCustom<SecurityUser> searchCustomer(@RequestBody SecurityUserSearchBody securityUserSearchBody, BindingResult result) {
        ResponseCustom<SecurityUser> responseCustom;
        SecurityUser securityUser = securityUserService.search(securityUserSearchBody);
        if (securityUser == null) {
            responseCustom = ResponseCustom.failed("操作失败");
            LOGGER.debug("Search Customer failed");
        } else {
            responseCustom = ResponseCustom.success(securityUser);
            LOGGER.debug("Search Customer success:{}", securityUser);
        }
        return responseCustom;
    }


    @PostMapping("/update/{customerId}")
    public ResponseCustom<Customer> update(@PathVariable("customerId") @ApiParam("用户ID") Long customerId,
                                           @RequestBody Customer customer, BindingResult result) {
        ResponseCustom<Customer> responseCustom;
        int count = customerService.updateCustomer(customerId, customer);
        if (count == 1) {
            responseCustom = ResponseCustom.success(customer);
            LOGGER.debug("updateCustomer success:{}", customer);
        } else {
            responseCustom = ResponseCustom.failed("操作失败");
            LOGGER.debug("updateCustomer failed:{}", customer);
        }
        return responseCustom;
    }


    @GetMapping("/bySecurityUser")
    public ResponseCustom<Customer> customerBySecurityUserId(@RequestParam("securityUserId") @ApiParam("安全用户ID") Long securityUserId) {
        return ResponseCustom.success(customerService.customerBySecurityUserId(securityUserId));
    }


}
