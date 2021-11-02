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
public class Mamifero extends Animal{
    protected String corPelo;

    @Override
    public void emitirSom() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Som de Mamífero...");
    }
    
    
}
