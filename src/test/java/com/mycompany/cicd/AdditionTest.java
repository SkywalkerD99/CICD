/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cicd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skywa
 */
public class AdditionTest {
    
    public AdditionTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        System.out.println("Test begins!!!");
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
        System.out.println("Test over!!!");
    }
    

    /**
     * Test of Addition method, of class Addition.
     */
    @Test
    public void testAddition() { 
        System.out.println("Addition");
        Integer member1 = 2;
        Integer member2 = 2;
        Addition instance = new Addition(member1, member2);
        Integer expResult = 4;
        Integer result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    public void testSubstraction() {
        System.out.println("Substraction");
        Integer member1 = 3;
        Integer member2 = 5;
        Substraction instance = new Substraction(member1, member2);
        Integer expResult = -2;
        Integer result = instance.getResult();
        assertEquals(expResult, result);
    }
    
}
