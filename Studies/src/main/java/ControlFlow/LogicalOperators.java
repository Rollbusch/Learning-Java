/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow;

/**
 *
 * @author Rollbusch
 */
public class LogicalOperators {
    
    public static void main(String[] args) {
        int temperature = 20;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm); // true
        
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
    
}
