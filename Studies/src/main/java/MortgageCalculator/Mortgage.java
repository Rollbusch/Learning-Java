/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Rollbusch
 */
public class Mortgage {
 
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;  
        Scanner scanner = new Scanner(System.in);
        
        int principal;
        System.out.println("Principal ($1K - $1M):");  
        while (true) {
            principal = scanner.nextInt();
            if (principal < 1_000 || principal > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                continue;
            } 
            else
                break;
        }
        
        float annualInterest;
        float monthlyInterest;
        System.out.println("Annual Interest Rate:");
        while (true) {
            annualInterest = scanner.nextFloat();
            
            if (annualInterest <= 0 || annualInterest > 30) {
                System.out.println("Enter a value greater than 0 and lass than o equals to 30.");
                continue;
            } else {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
        }
        
        byte years;
        int numberOfPayments;
        System.out.println("Period (Years):");
        while (true) {
            years = scanner.nextByte();
            
            if (years < 1 || years > 30) {
                System.out.println("Enter a value between 1 and 30.");
                continue;
            } else {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
        }        
        
        double montgage = principal 
                * ((monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)) 
                / 
                (Math.pow((1 + monthlyInterest), numberOfPayments) - 1));
       
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(montgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        
    }
    
}
