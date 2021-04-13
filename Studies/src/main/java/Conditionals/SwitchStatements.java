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
public class SwitchStatements {
     
    public static void main(String[] args) {
        String role = "admin";
        
        switch (role) {
            case "admin":
                System.out.println("You're an admin.");
                break;
                
            case "moderator":
                System.out.println("You're a moderator.");
                break;
                
            default:
                System.out.println("You're a guest");
        }
        
    }
    
}
