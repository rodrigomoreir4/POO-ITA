package com.rodrigomoreira;

import java.util.Scanner;

import com.rodrigomoreira.entities.Authority;
import com.rodrigomoreira.entities.Informal;
import com.rodrigomoreira.entities.Respectful;
import com.rodrigomoreira.entities.Status;

public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter personal data:");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Surname: ");
        String surname = sc.nextLine();

        System.out.print("Choose treatment: informal = 1, respectful = 2 or title = 3: ");
        int treatment = sc.nextInt();
        sc.nextLine();

        switch(treatment){
            case 1:
                Authority a = new Authority(name, surname, new Informal());
                System.out.println(a.getTreatment());
                break;
            case 2:
                System.out.print("Male or Female: ");
                String gender = sc.nextLine();
                Authority b = new Authority(name, surname, new Respectful(gender));
                System.out.println(b.getTreatment());
                break;
            case 3:
                System.out.print("Enter a title: ");
                String title = sc.nextLine();
                Authority c = new Authority(name, surname, new Status(title));
                System.out.println(c.getTreatment());
                break;
            default:
                System.out.println("Invalid treatment data!");
                break;

        }

        sc.close();
    
    }

}
