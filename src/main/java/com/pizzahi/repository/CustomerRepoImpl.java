package com.pizzahi.repository;

import com.pizzahi.model.Customer;
import com.pizzahi.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepoImpl implements CustomerRepository{
    private SessionFactory sessionFactory;

    @Autowired
    public CustomerRepoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.persist(customer);
        }catch (Exception ex){
            System.out.println("Unhandled encoding");
            ex.printStackTrace();
        }
    }

    public void delete(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(customer);
    }

    public List<Customer> getAll() {
        try {
            Session session = sessionFactory.getCurrentSession();
            return session.createQuery("from Customer").list();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }


    }

    public Customer getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Customer.class, id);
    }

}
