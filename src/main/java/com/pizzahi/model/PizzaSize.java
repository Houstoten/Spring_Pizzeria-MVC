package com.pizzahi.model;

import java.util.ArrayList;
import java.util.List;

public class PizzaSize {
    private List<String> sizes = new ArrayList<>();
    private static PizzaSize pizzasize = new PizzaSize();
    private PizzaSize(){
        sizes.add("Large");
        sizes.add("Medium");
        sizes.add("Small");
        sizes.add("Tiny");
    }
    public List<String> getAllSizes(){
        return sizes;
    }
    public static PizzaSize getInstance(){
        return pizzasize;
    }
}
