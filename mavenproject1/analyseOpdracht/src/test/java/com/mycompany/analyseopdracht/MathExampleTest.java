/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.analyseopdracht;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 
 * @author UR mama
 */
public class MathExampleTest {

    /**
     *
     */
    @Test
    public void testMultiply() {
        
        //Variabelen
        double a = 5.5;
        double b = 4.0;
        
        //Je verwacht dat de uitkomst 22 is
        double expected = 22;
        double result = MathExample.multiply(a, b);
        
        // bij 0.00001 verschil faalt de test
        assertEquals(expected, result, 0.00001); 
    }
}
