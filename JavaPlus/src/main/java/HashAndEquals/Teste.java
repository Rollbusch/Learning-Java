/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashAndEquals;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rollbusch
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Set<Aluno> alunos = recuperarAlunos();
        
        Aluno pesquisa = new Aluno(2L);
        
        Boolean existeAluno = alunos.contains(pesquisa);
        
        System.out.println("Existe esse aluno? " + existeAluno);
        
    }
    
    public static Set<Aluno> recuperarAlunos() {
            
        Aluno joao = new Aluno(1L, "João");
        Aluno maria = new Aluno(2L, "Maria");
        Aluno davi = new Aluno(3L, "Davi");

        Set<Aluno> alunos = new HashSet<Aluno>();
        alunos.add(joao);
        alunos.add(maria);
        alunos.add(davi);

        return alunos;

    }
    
}
