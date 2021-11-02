/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14.projetofinal;

/**
 *
 * @author andre
 */
public class Aula14ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Algorítimos");
        v[1] = new Video("Java");
        v[2] = new Video("POO");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("André", 44, "M", "deca");
        g[1] = new Gafanhoto("Dani", 43, "F", "dani");
        
        System.out.println("VÍDEOS\n-------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n-------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println("\nApós Visualizações...\n-------------------");
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        System.out.println(g[0].toString());
        System.out.println(v[2].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[0].toString());
        System.out.println(g[0].toString());
        System.out.println(v[1].toString());
        
        
    }
    
}
