package com.pizzahi.model;

import java.util.ArrayList;
import java.util.List;

public class PizzaType {
    private List<String> types = new ArrayList<>();
    private static PizzaType pizzatype = new PizzaType();
    private PizzaType(){
        types.add("Cezario");
        types.add("Carbonara");
        types.add("Caprichoza");
        types.add("Margarita");
    }
    public List<String> getAllTypes(){
        return types;
    }
    public static PizzaType getInstance(){
        return pizzatype;
    }
}
