/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracao;

/**
 *
 * @author Rollbusch
 */
public class Test {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("João", 21, TipoCliente.PESSOA_JURIDICA);
        
        c1.toString();
    }
    
}
