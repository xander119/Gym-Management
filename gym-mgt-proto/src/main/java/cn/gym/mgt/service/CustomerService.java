package cn.gym.mgt.service;

import cn.gym.mgt.dto.CustomerRequestBody;
import cn.gym.mgt.mbg.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> allCustomers(CustomerRequestBody customerRequestBody);

    Customer customerBySecurityUserId(Long securityUserId);

    Customer customerById(Long customerId);

    Integer createCustomer(Customer customer, Long securityUserId);

    int updateCustomer(Long customerId, Customer customer);

}
