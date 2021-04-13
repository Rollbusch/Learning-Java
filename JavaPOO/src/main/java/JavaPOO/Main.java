/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

/**
 *
 * @author Rollbusch
 */
public class Main {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = false;
        c1.status();
        c1.destampar();
        c1.rabiscar();
        
        
    }
    
}
