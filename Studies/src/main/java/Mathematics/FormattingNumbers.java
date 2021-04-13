/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;

import java.text.NumberFormat;

/**
 *
 * @author Rollbusch
 */
public class FormattingNumbers {
    
    public static void main(String[] args) { 
       
       String result = NumberFormat.getPercentInstance().format(0.1);;
       
       System.out.println(result); 
       
    }
}
