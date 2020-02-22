package com.pizzahi.controller;

import com.pizzahi.model.PizzaSize;
import com.pizzahi.model.PizzaType;
import com.pizzahi.service.CustomerService;
import com.pizzahi.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerService customerService = new CustomerServiceImpl();
    private List<String> sizes = PizzaSize.getInstance().getAllSizes();
    private List<String> types = PizzaType.getInstance().getAllTypes();

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getIndexPage(Model model){
        model.addAttribute("SizesList", sizes);
        model.addAttribute("TypesList",types);
        model.addAttribute("fst", "Jopa");
        types.forEach(System.out::println);
        return "index";
    }
}
