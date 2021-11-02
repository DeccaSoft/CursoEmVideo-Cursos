/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula2poo;

/**
 *
 * @author andre
 */
public class Roupas {
    boolean comum = true;
    boolean passa = true;
    boolean d = false;
    boolean le = false;
    boolean g = false;
    String cor = " ";
    boolean lavada = false;
    boolean passada = false;
    boolean ok = false;
    int qtd = 0;
    String peca = " ";
    double valor = 0.0d;   
    
    void lavar(){
        System.out.println("Lavando...");
        this.lavada = true;
        System.out.println("Roupa lavada!");
    }
    
    void passar(){
        System.out.println("Passando...");
        this.passada = true;
        System.out.println("Roupa Engomada!");
    }
    
    void pronta(){
        System.out.println("Empacotando...");
        this.ok = true;
        System.out.println("Roupa Pronta!");
    }
    
    
    
}
