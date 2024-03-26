package com.rodrigomoreira;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.rodrigomoreira.entities.Shopping;
import com.rodrigomoreira.entities.ShoppingInstallments;

public class ShoppingTest {


    @Test
    void debit(){
        Shopping s = new Shopping(1000.00);
        double result = s.getPrice();
        assertEquals(1000, result);
    }

    @Test
    void twoInstallments(){
        ShoppingInstallments si = new ShoppingInstallments(1000.00, 2, 3.5);
        double result = si.getPrice();
        double epsilon = 1.0;
        assertEquals(1072.0, result, epsilon);
    }

    @Test
    void fiveInstallments(){
        ShoppingInstallments si = new ShoppingInstallments(1000.00, 5, 3.5);
        double result = si.getPrice();
        double epsilon = 1.0;
        assertEquals(1188.0, result, epsilon);
    }

    @Test
    void tenInstallments(){
        ShoppingInstallments si = new ShoppingInstallments(1000.00, 10, 3.5);
        double result = si.getPrice();
        double epsilon = 1.0;
        assertEquals(1411.0, result, epsilon);
    }
    
}
