package com.rodrigomoreira.entities;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {
    
    private LocalDate dateOfBirth;

    public Person(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void getAge(){
        LocalDate today = LocalDate.now();
        Period age = Period.between(dateOfBirth, today);

        System.out.println("Your age is: " + age.getYears() + " years.");
    }
    
    public void getSign(){

        if ((dateOfBirth.getMonthValue() == Month.MARCH.getValue() && dateOfBirth.getDayOfMonth() >= 21) ||
            (dateOfBirth.getMonthValue() == Month.APRIL.getValue() && dateOfBirth.getDayOfMonth() <= 19)) {
            System.out.println("Your sign is Aries!");
        } else if ((dateOfBirth.getMonthValue() == Month.APRIL.getValue() && dateOfBirth.getDayOfMonth() >= 20) ||
            (dateOfBirth.getMonthValue() == Month.MAY.getValue() && dateOfBirth.getDayOfMonth() <= 20)) {
            System.out.println("Your sign is Taurus!");
        } else if ((dateOfBirth.getMonthValue() == Month.MAY.getValue() && dateOfBirth.getDayOfMonth() >= 21) ||
            (dateOfBirth.getMonthValue() == Month.JUNE.getValue() && dateOfBirth.getDayOfMonth() <= 20)) {
            System.out.println("Your sign is Gemini!");
        } else if ((dateOfBirth.getMonthValue() == Month.JUNE.getValue() && dateOfBirth.getDayOfMonth() >= 21) ||
            (dateOfBirth.getMonthValue() == Month.JULY.getValue() && dateOfBirth.getDayOfMonth() <= 22)) {
            System.out.println("Your sign is Cancer!");
        } else if ((dateOfBirth.getMonthValue() == Month.JULY.getValue() && dateOfBirth.getDayOfMonth() >= 23) ||
            (dateOfBirth.getMonthValue() == Month.AUGUST.getValue() && dateOfBirth.getDayOfMonth() <= 22)) {
            System.out.println("Your sign is Leo!");
        } else if ((dateOfBirth.getMonthValue() == Month.AUGUST.getValue() && dateOfBirth.getDayOfMonth() >= 23) ||
            (dateOfBirth.getMonthValue() == Month.SEPTEMBER.getValue() && dateOfBirth.getDayOfMonth() <= 22)) {
            System.out.println("Your sign is Virgo!");
        } else if ((dateOfBirth.getMonthValue() == Month.SEPTEMBER.getValue() && dateOfBirth.getDayOfMonth() >= 23) ||
            (dateOfBirth.getMonthValue() == Month.OCTOBER.getValue() && dateOfBirth.getDayOfMonth() <= 22)) {
            System.out.println("Your sign is Libra!");
        } else if ((dateOfBirth.getMonthValue() == Month.OCTOBER.getValue() && dateOfBirth.getDayOfMonth() >= 23) ||
            (dateOfBirth.getMonthValue() == Month.NOVEMBER.getValue() && dateOfBirth.getDayOfMonth() <= 21)) {
            System.out.println("Your sign is Scorpio!");
        } else if ((dateOfBirth.getMonthValue() == Month.NOVEMBER.getValue() && dateOfBirth.getDayOfMonth() >= 22) ||
            (dateOfBirth.getMonthValue() == Month.DECEMBER.getValue() && dateOfBirth.getDayOfMonth() <= 21)) {
            System.out.println("Your sign is Sagittarius!");
        } else if ((dateOfBirth.getMonthValue() == Month.DECEMBER.getValue() && dateOfBirth.getDayOfMonth() >= 22) ||
            (dateOfBirth.getMonthValue() == Month.JANUARY.getValue() && dateOfBirth.getDayOfMonth() <= 19)) {
            System.out.println("Your sign is Capricorn!");
        } else if ((dateOfBirth.getMonthValue() == Month.JANUARY.getValue() && dateOfBirth.getDayOfMonth() >= 20) ||
            (dateOfBirth.getMonthValue() == Month.FEBRUARY.getValue() && dateOfBirth.getDayOfMonth() <= 18)) {
            System.out.println("Your sign is Aquarius!");
        } else {
            System.out.println("Your sign is Pisces!");
        }

    }

}


