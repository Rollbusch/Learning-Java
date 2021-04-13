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
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(true);
    }
    
    public void estadoAtual () {
        System.out.println("--------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC"))
            this.setSaldo(50);
        else if (tipo.equals("CP"))
            this.setSaldo(150);
    }
    
    public void fecharConta() {
        if (this.saldo > 0) 
            System.out.println("Conta com dinheiro.");
         else if (this.saldo < 0) 
            System.out.println("Conta com débito.");
         else 
            this.setStatus(false);
    }
    
    public void depositar(int valor) {
        if (this.status){
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar.");
        }
    }
    
    public void sacar(float valor) {
        if (this.status){
            if (this.saldo >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar.");
        }
    }
    
    public void pagarMensal () {
        int valor = 0;
        if (tipo.equals("CC")) {
            valor = 12;
        } else if (tipo.equals("CP")) {
            valor = 20;
        } 
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Impossível pagar.");
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
