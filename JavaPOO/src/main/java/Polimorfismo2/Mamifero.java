/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo2;

/**
 *
 * @author Rollbusch
 */
public class Mamifero extends Animal{
    
    protected String pelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    
    
    
}
