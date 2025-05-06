package com.javaex.ex06;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDollar(double won){
        double result = won / rate;
    	return result;
    
    }

    public static double toKWR(double dollar){
        double result = dollar * rate;
        return result;
    }
    
 
}
