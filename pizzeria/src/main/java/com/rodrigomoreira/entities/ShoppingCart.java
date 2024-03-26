package com.rodrigomoreira.entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    
   private List<Pizza> list = new ArrayList<>();
   private Double total=0.0;

   public void addPizza(Pizza pizza){
        list.add(pizza);
   }

   public double totalPrice(){
      for (Pizza pizza : list){
         if (pizza.getPrice() == 0){
            continue;
         }
         total += pizza.getPrice();
      }
      return total;
   }
   
}
