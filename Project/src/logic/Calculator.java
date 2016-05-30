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
        
    public int getMin(int percent, int cwp ,int cww )
    {
        int answer = cwworth/10;
        answer = cwpercent* answer;
        answer = percent - answer;
        int cool = percent/10;
        answer = answer/cool;
        
        return answer;
        
    }
    
    }
    
