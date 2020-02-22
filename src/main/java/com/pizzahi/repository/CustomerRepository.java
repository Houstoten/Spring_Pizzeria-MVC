package com.pizzahi.repository;

import com.pizzahi.model.Customer;
import com.pizzahi.model.Order;

import java.util.List;

public interface CustomerRepository {
    void save(Customer customer);

    void delete(Customer customer);

    List<Customer> getAll();

    Customer getById(int id);

}
