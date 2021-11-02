/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.polimorfismo;

/**
 *
 * @author andre
 */
public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Comendo Substâncias...");
    }

    @Override
    public void emitirSom() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Peixe não faz som!");
    }
    
    public void soltarBolhas(){
        System.out.println("Soltando Bolhas...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
