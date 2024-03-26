package com.rodrigomoreira;

import java.util.Locale;
import java.util.Scanner;

import com.rodrigomoreira.entities.ProductWithSize;
import com.rodrigomoreira.entities.ShoppingCart;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("Enter quantity products: ");
        int n = sc.nextInt();
        System.out.println();
        sc.nextLine();

        for (int i=0; i<n; i++){
            System.out.println("Enter data product " + (i+1) + ": ");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Code: ");
            int code = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Size S, M ou L: ");
            char size = Character.toLowerCase(sc.next().charAt(0));

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            ProductWithSize p = new ProductWithSize(name, code, price, size);
            cart.addProduct(p, quantity);
            System.out.println();
        }

        cart.listProducts();

        System.out.println();
        System.out.print("Do you want to delete a product Y or N: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        sc.nextLine();
        if (ch == 'y'){
            System.out.print("Code to delete: ");
            int codeToDelete = sc.nextInt();
            System.out.print("Size to delete S, M OR L: ");
            char sizeToDelete = Character.toLowerCase(sc.next().charAt(0));
            System.out.print("Quantity to delete: ");
            int quantityToDelete = sc.nextInt();
            ProductWithSize productToDelete = new ProductWithSize(codeToDelete, sizeToDelete);
            cart.removeProduct(productToDelete, quantityToDelete);
        }

        System.out.println();
        cart.listProducts();

        System.out.println();
        System.out.println("Total value $: " + String.format("%.2f", cart.totalPrice()));

        sc.close();
    }

}
