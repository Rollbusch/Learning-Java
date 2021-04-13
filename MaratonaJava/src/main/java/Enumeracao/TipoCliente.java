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
public enum TipoCliente {
    PESSOA_FISICA(1), PESSOA_JURIDICA(2);
    
    int tipo;

    private TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    
    
    
}
