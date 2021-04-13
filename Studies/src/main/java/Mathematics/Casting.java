/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;

/**
 *
 * @author Rollbusch
 */
public class Casting {
    public static void main(String[] args) {
        // Implicit casting
        // Automatic conversion
        // byte > short > int > long > float > double
        String x = "1.1";
        double y = Double.parseDouble(x) + 2; // 2.0
        
        System.out.println(y);
        
    }
}
