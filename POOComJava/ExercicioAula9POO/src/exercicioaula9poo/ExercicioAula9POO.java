/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula9poo;

/**
 *
 * @author andre
 */
public class ExercicioAula9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("André", 44, "M");
        p[1] = new Pessoa("Dani", 43, "F");
        
        l[0] = new Livro("Aprendendo Java", "Guanabara", 300, p[0]);
        l[1] = new Livro("Pedagogia Avançada", "Maria", 800, p[1]);
        l[2] = new Livro("POO para Iniciantes", "Guanabara", 500, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
        
        System.out.println(l[2].detalhes());
        
        
    }
    
}
