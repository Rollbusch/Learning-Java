/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author Rollbusch
 */
public class DoWhileLoops {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
        } while (!input.equals("quit"));
        
    }
}
