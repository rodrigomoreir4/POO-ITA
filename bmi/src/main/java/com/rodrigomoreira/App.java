package com.rodrigomoreira;

import java.util.Locale;
import java.util.Scanner;

import com.rodrigomoreira.entities.Patient;

public class App {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight: ");
        double weights = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        Patient pt = new Patient(height, weights);

        pt.diagnosis();
        sc.close();

    }

}
