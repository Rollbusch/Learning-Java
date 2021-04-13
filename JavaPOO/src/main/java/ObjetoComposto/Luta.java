package ObjetoComposto;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    
    public void lutar() {
        
        if (this.aprovada) {
            System.out.println("### APRESENTANDO... O DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### APRESENTANDO... O DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random(); // 0, 1 e 2
            int vencedor = aleatorio.nextInt(3); 
             
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!!!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " GANHOU!!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " GANHOU!!!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        } 
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    
    
    
}
