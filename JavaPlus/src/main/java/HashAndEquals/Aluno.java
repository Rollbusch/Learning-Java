/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashAndEquals;

/**
 *
 * @author Rollbusch
 */
public class Aluno {
    
    private long codigo;
    private String nome;

    public Aluno(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    Aluno(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
    
    
}
