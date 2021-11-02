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
public class ExercicioAula2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Roupas r1= new Roupas();
        r1.qtd = 10;
        r1.peca = "Camisa de Malha";
        r1.valor = 4.6 * r1.qtd;
        
        Roupas r2 = new Roupas();
        r2.peca = "Camisa de Tecido";
        r2.qtd = 5;
        r2.comum = false;
        r2.d = true;
        r2.valor = 5.45 * r2.qtd;
        
        r1.lavar();
        r1.passar();
        r1.pronta();
        System.out.println("Valor: " + r1.valor);
        
        r2.lavar();
        r2.passar();
        r2.pronta();
        System.out.println("Valor: " + r2.valor);
        
    }
    
}
