package cn.gym.mgt.gymmgtproto.service;

import cn.gym.mgt.gymmgtproto.dto.CustomerRequestBody;
import cn.gym.mgt.gymmgtproto.mbg.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> allCustomers(CustomerRequestBody customerRequestBody);

    Customer customerBySecurityUserId(Long securityUserId);

    Customer customerById(Long customerId);

    Integer createCustomer(Customer customer, Long securityUserId);

    int updateCustomer(Long customerId, Customer customer);

}
