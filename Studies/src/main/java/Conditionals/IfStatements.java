/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

/**
 *
 * @author Rollbusch
 */
public class IfStatements {
 
    public static void main(String[] args) {
        
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink water");
        } 
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
        
        
    }
    
}
