/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayLearning;

import java.util.Arrays;

/**
 *
 * @author Rollbusch
 */
public class ArrayLearning {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        
        int[] numbers2 = { 2, 3, 5, 1, 4 };
        
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers));
        
        
    }
    
}
