package com.rodrigomoreira.entities;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
        
    private Map<Object,Integer> products = new HashMap<>();

    public Map<Object, Integer> getProducts() {
        return products;
    }

    public void listProducts(){
        for (Map.Entry<Object,Integer> entry : products.entrySet()){
            ProductWithSize product = (ProductWithSize) entry.getKey();
            System.out.println("Product: " + product.getName() + 
            ", Size: " + product.getSize() + 
            ", Code: " + product.getCode() +
            ", Quantity: " + entry.getValue());
        }
    }

    public void addProduct(Object obj, Integer quantity){
        if(products.containsKey(obj)){
            int currentQuantity = products.get(obj);
            products.put(obj, currentQuantity + quantity);
        } else {
            products.put(obj, quantity);
        }
    }

    public void removeProduct(Object obj, Integer quantityToRemove){
        Integer currentQuantity = products.get(obj);
        if (currentQuantity != null){
            if(currentQuantity <= quantityToRemove){
                products.remove(obj);
            } else {
                products.put(obj, currentQuantity - quantityToRemove);
            }
        }
    }

    public double totalPrice(){
        double total = 0.0;
    
        for (Map.Entry<Object,Integer> entry : products.entrySet()){
            Object obj = entry.getKey();
            int quantity = entry.getValue();
            Product product = (Product) obj;
            total += product.getPrice() * quantity;
        }

        return total;
    }

}
