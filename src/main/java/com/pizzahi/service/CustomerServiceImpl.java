package com.pizzahi.service;

import com.pizzahi.model.Customer;
import com.pizzahi.model.Order;
import com.pizzahi.repository.CustomerRepoImpl;
import com.pizzahi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    @Transactional
    public void save(Customer customer, Order order) {
        if (customer != null) {
//            List<Customer> customers = customerRepo.getAll();
//            if (!customers.isEmpty()) {
//                System.out.println("DB size is "+ customers.size());
//                customer.setId(customers.size() + 1);
//            } else {
//                customer.setId(0);
//            }
//            if (order != null) {
//                customer.setOrder(order);
//                order.setId(customer.getId());
//            }
            System.out.println("Before-Saved Service Here!");
            customer.setOrder(order);
            customerRepo.save(customer);
            System.out.println("Saved: " + customer.toString());
        }
    }

    @Transactional
    public void delete(Customer customer) {
        if (customer != null)
            customerRepo.delete(customer);
    }

    @Transactional
    public List<Customer> getAll() {
        return customerRepo.getAll();
    }

    @Transactional
    public Customer getById(Integer id) {
        if (id != null) {
            return customerRepo.getById(id);
        }
        return null;
    }


}
