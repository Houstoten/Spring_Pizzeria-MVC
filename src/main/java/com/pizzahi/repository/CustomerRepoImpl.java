package com.pizzahi.repository;

import com.pizzahi.model.Customer;
import com.pizzahi.model.Order;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepoImpl implements CustomerRepository{
    private List<Customer> customers = new ArrayList<>();

    public void save(Customer customer) {
    customers.add(customer);
    }

    public void delete(Customer customer) {
    customers.remove(customer);
    }

    public List<Customer> getAll() {
        return customers;
    }

    public Customer getById(int id) {
        return customers.get(id);
    }

}
