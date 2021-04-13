/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca2;

/**
 *
 * @author Rollbusch
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        a1.setNome("João");
        a1.pagarMensalidade();
        
        b1.setNome("João");
        b1.renovarBolsa();
        b1.pagarMensalidade();
        
        
        
    }
    
}
