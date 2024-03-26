package com.rodrigomoreira.entities;

public class Patient {
    
    Double height;
    Double weights;

    public Patient(Double height, Double weights) {
        this.height = height;
        this.weights = weights;
    }

    public Double calculateBMI(){
        return weights / (height * height);
    }

    public void diagnosis(){

        double x = calculateBMI();
        if (x < 16){
            System.out.println("Very serious underweight");
        }
        else if (16 <= x && x <= 16.99){
            System.out.println("Severe underweight");
        }
        else if (17 <= x && x <= 18.49){
            System.out.println("Low weight");
        }
        else if (18.50 <= x && x <= 24.99){
            System.out.println("Normal weight");
        }
        else if (25 <= x && x <= 29.99){
            System.out.println("Overweight");
        }
        else if (30 <= x && x <= 34.99){
            System.out.println("Grade I obesity");
        }
        else if ( 35 <= x && x <= 39.99){
            System.out.println("Grade II obesity");
        }
        else
            System.out.println("Grade III obesity (morbid obesity)");
        }
        
}
