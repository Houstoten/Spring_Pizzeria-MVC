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

    @Autowired
    private EmailService emailService;

    @Transactional
    public void save(Customer customer, Order order) {
        if (customer != null && customer.getName() != null && customer.getMail() != null && order.getCount() > 0
                && order.getCount() < 255 && order.getSize() != null && order.getType() != null && customer.getName().length() < 30
                && customer.getMail().length() < 50 && order.getType().length() < 30 && order.getSize().length() < 20) {
            System.out.println("Before-Saved Service Here!");
            customer.setOrder(order);
            customerRepo.save(customer);
            System.out.println("Saved: " + customer.toString());
            emailService.sendLetter(customer.getName(), customer.getMail(),
                    order.getType(), order.getSize(), order.getCount(), order.getDatetime());
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
