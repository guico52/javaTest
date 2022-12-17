package com.calculator;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b) throws ErrorDivisorException{
        if(b==0)
            throw new ErrorDivisorException("divisor should not be 0");
        return a/b;
    }
}
