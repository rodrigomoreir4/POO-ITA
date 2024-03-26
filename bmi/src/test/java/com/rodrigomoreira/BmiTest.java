package com.rodrigomoreira;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rodrigomoreira.entities.Patient;

public class BmiTest {

    @Test
    void calculateBMITest() {

		double epsilon = 0.2;
		double weight = 64;
		double height = 1.74;
		Patient p = new Patient(height, weight);
		double x = p.calculateBMI();
		assertEquals(21, x, epsilon);

	}
    
}