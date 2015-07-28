package org.betavzw.eclipsemaven.project3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private CalculatorInterface calc;

    @Before
    public void init(){
    	calc = new Calculator();
    }
    @After
    public void exit() {
    	calc = null;
    }
    @Test
    public void testOptellen()
    {
        
        int getal1 = 1;
        int getal2 = 2;
        int expected = getal1 + getal2;
        int actual = calc.optellen(getal1, getal2);
        assertEquals(expected, actual);
    }
    @Test
    public void testAftrekken()
    {
        
        int getal1 = 1;
        int getal2 = 2;
        int expected = getal1 - getal2;
        int actual = calc.aftrekken(getal1, getal2);
        assertEquals(expected, actual);
    }
    @Test
    public void testVermenigvuldigen()
    {
        
        int getal1 = 1;
        int getal2 = 2;
        int expected = getal1 * getal2;
        int actual = calc.delen(getal1, getal2);
        assertEquals(expected, actual);
    }
    @Test
    public void testDelen()
    {
        
        int getal1 = 1;
        int getal2 = 2;
        int expected = getal1 / getal2;
        int actual = calc.vermenigvuldigen(getal1, getal2);
        assertEquals(expected, actual);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testException(){
    	int getal1 = 1;
    	int getal2 = 0;
    	calc.vermenigvuldigen(getal1, getal2);
    }

}
