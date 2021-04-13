/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracao;

import java.util.Objects;

/**
 *
 * @author Rollbusch
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private TipoCliente tipoCliente;

    public Cliente(String nome, int idade, TipoCliente tipoCliente) {
        this.nome = nome;
        this.idade = idade;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        System.out.println("#####################");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("TipoCliente: " + this.tipoCliente.getTipo());
        return "true";
    }  
    
    
}
