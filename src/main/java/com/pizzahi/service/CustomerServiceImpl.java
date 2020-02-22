package com.pizzahi.service;

import com.pizzahi.model.Customer;
import com.pizzahi.model.Order;
import com.pizzahi.repository.CustomerRepoImpl;
import com.pizzahi.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepo = new CustomerRepoImpl();


    public void save(Customer customer, Order order) {
        if (customer != null) {
            List<Customer> customers = customerRepo.getAll();
            if (!customers.isEmpty()) {
                Customer lastCustomer = customers.get(customers.size() - 1);
                customer.setId(lastCustomer.getId() + 1);
            } else {
                customer.setId(0);
            }
            if (order != null)
                customer.setOrder(order);
            customerRepo.save(customer);
        }
    }


    public void delete(Customer customer) {
        if (customer != null)
            customerRepo.delete(customer);
    }


    public List<Customer> getAll() {
        return customerRepo.getAll();
    }


    public Customer getById(Integer id) {
        if (id != null) {
            return customerRepo.getById(id);
        }
        return null;
    }


}
