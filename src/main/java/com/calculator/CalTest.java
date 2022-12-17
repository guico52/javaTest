package com.calculator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalTest {

    Calculator c = new Calculator();

    @Before
    public void begin(){
        System.out.println("test begin");
    }

    @After
    public void end(){
        System.out.println("test end");
    }

    @Test
    public void addTest(){
        assertEquals(2, c.add(1,1));
    }

    @Test
    public void subtractTest(){
        assertEquals(3, c.subtract(4,1));
    }

    @Test
    public void multiplyTest(){
        assertEquals(6, c.multiply(2,3));
    }

    @Test
    public void divideTest1() throws ErrorDivisorException {
        assertEquals(2, c.divide(4,2));
    }

    @Test
    public void divideTest2() throws ErrorDivisorException {
        assertEquals(0, c.divide(4,0));
    }



}
