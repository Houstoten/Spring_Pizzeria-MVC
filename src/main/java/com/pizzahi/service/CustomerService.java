package com.pizzahi.service;

import com.pizzahi.model.Customer;
import com.pizzahi.model.Order;

import java.util.List;

public interface CustomerService {
    void save(Customer customer, Order order);

    void delete(Customer customer);

    List<Customer> getAll();

    Customer getById(Integer id);

}
