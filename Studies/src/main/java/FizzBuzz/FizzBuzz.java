/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FizzBuzz;

import java.util.Scanner;

/**
 *
 * @author Rollbusch
 */
public class FizzBuzz {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        System.out.println("Number: ");
        int number = scanner.nextInt();
        boolean byFive = (number % 5 == 0);
        boolean byThree = (number % 3 == 0);
        
        if (byFive && byThree)
            System.out.println("FizzBuzz");
        else if (byFive)
            System.out.println("Fizz");
        else if (byThree)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
    
}
