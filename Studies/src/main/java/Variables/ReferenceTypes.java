/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

import java.awt.Point;
import java.util.Date;

/**
 *
 * @author Rollbusch
 */
public class ReferenceTypes {
 
    public static void main(String[] args) {
     
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        
        System.out.println(point2);
        
    }
    
}
