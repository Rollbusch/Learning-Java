package Exercicio;

public class Exercicio {
    
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("João", 21, 'M');
        p[1] = new Pessoa("Letícia", 20, 'F');
        
        l[0] = new Livro("Java para iniciantes", "O'reyle", 422, p[0]);
        l[1] = new Livro("Cyberhack", "Antiscammer", 358, p[0]);
        l[2] = new Livro("Python para iniciantes", "O'reyle", 725, p[1]);
        
        l[2].abrir();
        l[2].folhear(900);
        
        System.out.println(l[2].detalhes());
        
        
    }
    
}
