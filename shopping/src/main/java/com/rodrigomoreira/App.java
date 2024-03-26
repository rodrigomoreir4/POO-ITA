package com.rodrigomoreira;

import java.util.Locale;
import java.util.Scanner;

import com.rodrigomoreira.entities.ShoppingInstallments;

public class App {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter purchase details: ");
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Fees: ");
        double fees = sc.nextDouble();
        System.out.print("Installments: ");
        int installment = sc.nextInt();

        ShoppingInstallments si = new ShoppingInstallments(price, installment, fees);

        System.out.println();
        System.out.println(installment + " installments of $ " + String.format("%.2f",si.getPrice()/installment) + "\n" +
        "Value Total: $ " + String.format("%.2f",si.getPrice()));

        sc.close();
    
    }

}
