package com.rodrigomoreira;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import com.rodrigomoreira.entities.Pizza;
import com.rodrigomoreira.entities.ShoppingCart;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("Amount Pizzas: ");
        int n = sc.nextInt();
        Pizza[] pizzas = new Pizza[n];

        System.out.println();
        for(int p=0; p<pizzas.length; p++){
            System.out.print("Amount pizza " + (p+1) + " ingredients: ");
            int y = sc.nextInt();
            sc.nextLine();
            pizzas[p] = new Pizza();
            for (int i=1; i<=y; i++){
                System.out.print("Ingredient nº" +i+ ": ");
                String ingredient = sc.nextLine();
                pizzas[p].setPizzaIngredients(ingredient);
                pizzas[p].addIngredient(ingredient);
                pizzas[p].setPrice(y);
            }

            cart.addPizza(pizzas[p]);;
            System.out.println();

        }

        int z = 1;
        for (Pizza pizza : pizzas){
            System.out.println("Pizza number: " + z);
            for(String key : pizza.getPizzaIngredients().keySet()){
                System.out.println("Ingredient: " + key + ", Quantity: "
                + pizza.getPizzaIngredients().get(key));
            }
            System.out.println("Price of pizza $: " + String.format("%.2f", pizza.getPrice()));
            System.out.println();
            z += 1;
        }

        System.out.println("Ingredients used in total:");
        for (Map.Entry<String, Integer> entry : Pizza.getTotalIngredients().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();
        System.out.println("Total value $: " + String.format("%.2f", cart.totalPrice()));

        sc.close();

	}

}
