/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingInput;

import java.util.Scanner;

/**
 *
 * @author Rollbusch
 */
public class ReadingInput {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
        
    }
    
}
