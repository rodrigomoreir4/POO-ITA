package com.rodrigomoreira;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rodrigomoreira.entities.Product;
import com.rodrigomoreira.entities.ProductWithSize;
import com.rodrigomoreira.entities.ShoppingCart;

public class StoreTest {
    
    Product p1 = new Product("camisa", 0102, 15.00);
    Product p2 = new Product("camisa", 0102, 15.00);
    ProductWithSize p3 = new ProductWithSize("camisa", 0102, 15.00, 'p');
    ProductWithSize p4 = new ProductWithSize("camisa", 0102, 15.00, 'g');
    Product p5 = new Product(0102);
    ProductWithSize p6 = new ProductWithSize(0102, 'm');
    ShoppingCart cart = new ShoppingCart();

    @BeforeAll
    static void print1(){
        System.out.println("Starting tests...");
    }

    @BeforeEach
    void test1(){
        cart.addProduct(p1, 1);
        cart.addProduct(p2, 1);
        cart.addProduct(p3, 1);
        cart.addProduct(p4, 1);
        cart.addProduct(p5, 1);
        cart.addProduct(p6, 1);
    }

	@Test
	void productTest() {
		boolean result1 = p1.equals(p2);
        boolean result2 = p1.equals(p5);
		assertEquals(true, result1);
        assertEquals(true, result2);
        
	}

    @Test
    void productWithSize(){
        boolean result1 = p3.equals(p4);
		assertEquals(false, result1);
    }

    @Test
    void productsTest(){
        boolean result2 = p1.equals(p3);
        assertEquals(false, result2);
    }

    @Test
    void addProductTest(){
        int result = cart.getProducts().size();
        assertEquals(4, result);
    }

    @Test
    void removeProductTest(){
        cart.removeProduct(p6, 1);
        int result = cart.getProducts().size();
        assertEquals(3 , result);
    }

    @Test
    void totalPrice(){
        double result = cart.totalPrice();
        assertEquals(75.00, result);
    }

    @AfterAll
        static void print2(){
            System.out.println("Finishing tests!");
        }
}
