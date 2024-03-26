package com.rodrigomoreira;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rodrigomoreira.entities.Pizza;
import com.rodrigomoreira.entities.ShoppingCart;

public class PizzeriaTest {
    
    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza();
    ShoppingCart cart = new ShoppingCart();

    @BeforeAll
    static void start(){
        System.out.println("Before");
    }

    @BeforeEach
    void print1(){
        System.out.println("Starting test!");
    }

    @AfterEach
    void print2(){
        System.out.println("Finishing test!");
    }

    @Test
    public void testIngredients(){
        p1.setPizzaIngredients("Onion");
        p1.setPizzaIngredients("Pepperoni");
        p1.setPizzaIngredients("Tomato");
        int result = p1.getPizzaIngredients().size();
        assertEquals(3, result);
    }

    @Test
    public void testPrice(){
        p1.setPrice(3);
        double price = p1.getPrice();
        assertEquals(20, price);
    }

    @Test
    public void testCart(){
        p1.setPrice(3);
        cart.addPizza(p1);
        cart.addPizza(p2);
        double total = cart.totalPrice();
        assertEquals(20.0, total);
    }

    @AfterAll
    static void removeIngredients(){
        Pizza.setTotalIngredients("Cheese");
        Pizza.setTotalIngredients("Bacon");
        Pizza.setTotalIngredients("Chicken");
        Pizza.removeAllIngredients(Pizza.getTotalIngredients());
        int result = Pizza.getTotalIngredients().size();
        assertEquals(0, result);
    }

}
