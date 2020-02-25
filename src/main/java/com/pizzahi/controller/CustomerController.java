package com.pizzahi.controller;

import com.pizzahi.model.Customer;
import com.pizzahi.model.Order;
import com.pizzahi.model.PizzaSize;
import com.pizzahi.model.PizzaType;
import com.pizzahi.service.CustomerService;
import com.pizzahi.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class CustomerController {

    private CustomerService customerService;


    private List<String> sizes = PizzaSize.getInstance().getAllSizes();
    private List<String> types = PizzaType.getInstance().getAllTypes();

    @Autowired
    public CustomerController(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/main_page", method = RequestMethod.GET)
    public String returnFormInputs(Model model) {
        model.addAttribute("SizesList", sizes);
        model.addAttribute("TypesList", types);
        System.out.println("Get Method Here!");
        return "main_page";
    }

    @RequestMapping(value = "/main_page", method = RequestMethod.POST)
    public String getNewCustomerAndOrder(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email,
                                       @RequestParam(value = "typesItem") String typesItem, @RequestParam(value = "sizesItem") String sizesItem,
                                       @RequestParam(value = "count") int count) throws UnsupportedEncodingException {
        Order order = new Order();
        order.setSize(new String(sizesItem.getBytes(), StandardCharsets.UTF_8));
        order.setType(new String(typesItem.getBytes(), StandardCharsets.UTF_8));
        order.setCount(count);
        order.setDatetime(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()).toString());
        Customer customer = new Customer();
        customer.setName(new String(name.getBytes(), StandardCharsets.UTF_8));
        customer.setMail(new String(email.getBytes(), StandardCharsets.UTF_8));
        System.out.println("Before-Post Method Here!");
        customerService.save(customer, order);
        System.out.println("Post Method Here!");
        return "redirect:main_page";
        //!ssgtdds12y33
    }
}
