/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Rollbusch
 */
public class Banco {
    
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Joao");
        p1.abrirConta("CP");
        p1.sacar(150);
        p1.fecharConta();
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Leticia");
        p2.abrirConta("CC");
        p2.depositar(250);
        p2.sacar(100);
        p2.estadoAtual();
        
    }
    
}
