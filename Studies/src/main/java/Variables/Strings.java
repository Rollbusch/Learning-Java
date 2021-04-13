/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

/**
 *
 * @author Rollbusch
 */
public class Strings {
 
    public static void main(String[] args) {
     
        String message = "Hello World" + "!!";
        message.endsWith("!!"); // true
        message.length(); // 13
        message.indexOf("sky"); // -2
        message.replace("!", "*"); // Hello World**
        message.toLowerCase(); // hello world!!
        message.trim(); // Remove all spaces before and after the text
        System.out.println(message.toLowerCase());
        
    }
    
}
