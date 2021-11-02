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
public class Aula12Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal a = new Animal(); //Não se pode instanciar Classes Abstratas!
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.3);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        r.locomover();
        p.locomover();
        a.locomover();
        
        Canguru cg = new Canguru();
        Cachorro cc = new Cachorro();
        Cobra cb = new Cobra();
        Tartaruga tt = new Tartaruga();
        GoldFish gf = new GoldFish();
        Arara ar = new Arara();
        
        cg.locomover();
        cc.locomover();
        cc.emitirSom();
        
    }
    
}
