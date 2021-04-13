/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author Rollbusch
 */
public class Teste {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p2.setName("João");
        p2.setIdade(21);
        p2.setMatr(12312312);
        p2.setSexo('M');
        p2.setCurso("Ciência da Computação");
        System.out.println(p2.toString());
         
        
    }
    
}
