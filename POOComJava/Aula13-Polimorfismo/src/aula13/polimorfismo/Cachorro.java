/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13.polimorfismo;

/**
 *
 * @author andre
 */
public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        //super.emitirSom(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Au, au, au...");
    }
    
    public void reagir(String frase){
        if (frase.equals("Menino!!!") || frase.equals("Olha a comid!")){
            System.out.println("Abanando o rabo e latindo...");
            this.emitirSom();
        }else{
            System.out.println("Rosnando...");
        }
    }
    public void reagir(int hora, int min){
        if (hora<12) {
            System.out.println("Abanando o Rabo...");
        } else if (hora >= 18){
            System.out.println("Ignorando...");
        }else{
            System.out.println("Abanando o rabo e latindo...");
            this.emitirSom();
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanando o rabo...");
        }else{
            System.out.println("Rosnando e latindo...");
            this.emitirSom();
        }
    }
    public void reagir(int idade, double peso){
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanando o rabo...");
            } else {
                System.out.println("Latindo...");
                this.emitirSom();
            }
        } else {
            if (peso<10) {
                System.out.println("Rosnando...");
            } else {
                System.out.println("Ignorando...");
            }
        }
    }
    
}
