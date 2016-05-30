/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Samprit
 */
public class Calculator {
        
    public static void main (String[] args)
    {
        System.out.println(getMin(70,80,40));
    }
    
    public static String getMin(double percent, double cwp, double cww )
    {
        double a = cww/100;
        double b = cwp*a;
        double c = percent - b;
        double d = 100-cww;
        double e = d/100;
        double answer = c/e;
        answer = Math.round(answer);
        String sa = Double.toString(answer);
        return sa;
    }
    
    }
    
