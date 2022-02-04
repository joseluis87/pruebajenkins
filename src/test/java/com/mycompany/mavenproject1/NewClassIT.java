/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ceti
 */
public class NewClassIT {
    
    public NewClassIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ejercicio1 method, of class NewClass.
     */
    @Test
    public void testEjercicio1() {
        System.out.println("ejercicio1");
        int expResult = 1;
        int result = NewClass.ejercicio1();
        assertEquals(expResult, result);

    }

    /**
     * Test of main method, of class NewClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewClass.main(args);

    }
    
}
