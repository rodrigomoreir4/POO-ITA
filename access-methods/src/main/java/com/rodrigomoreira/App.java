package com.rodrigomoreira;

import java.time.LocalDate;
import java.util.Scanner;

import com.rodrigomoreira.entities.Person;

public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birthday:");

        System.out.print("Day: ");
        int day = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.print("Year: ");
        int year = sc.nextInt();

        Person p = new Person(LocalDate.of(year, month, day));

        p.getAge();
        p.getSign();
        sc.close();

    }
    
}