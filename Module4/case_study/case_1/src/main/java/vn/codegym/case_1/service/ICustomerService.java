package vn.codegym.case_1.service;

import vn.codegym.case_1.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    void delete(Long id);
}
