package com.rodrigomoreira.entities;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    
    private Double price=0.0;
    private static Map<String, Integer> totalIngredients = new HashMap<>();
    private Map<String, Integer> pizzaIngredients = new HashMap<>();

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price == 1 || price == 2){
            this.price = 15.0;
        }
        else if (3 <= price && price <= 5){
            this.price = 20.0;
        } 
        else if (price > 5) {
            this.price = 23.0;
        }
    }

    public static Map<String, Integer> getTotalIngredients() {
        return totalIngredients;
    }

    public static void setTotalIngredients(String ingredient){
        if(totalIngredients.containsKey(ingredient)){
            int quantity = totalIngredients.get(ingredient);
            totalIngredients.put(ingredient, quantity + 1);
        } else {
            totalIngredients.put(ingredient, 1);
        }
    }   

    public Map<String, Integer> getPizzaIngredients() {
        return pizzaIngredients;
    }

    public void setPizzaIngredients(String ingredient){
        if(pizzaIngredients.containsKey(ingredient)){
            int quantity = pizzaIngredients.get(ingredient);
            pizzaIngredients.put(ingredient, quantity + 1);
        } else {
            pizzaIngredients.put(ingredient, 1);
        }
    }

    public void addIngredient(String ingredient){
        setTotalIngredients(ingredient);
    }

    public static void removeAllIngredients(Map<String, Integer> totalIngredients){
        totalIngredients.clear();
    }

}
