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
public class Cachorro extends Mamifero{

    @Override
    public void emitirSom() {
        super.emitirSom(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Latindo... Au, Au, Au !!!");
    }
    
    
}
