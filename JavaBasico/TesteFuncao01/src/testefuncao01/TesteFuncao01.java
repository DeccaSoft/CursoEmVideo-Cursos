/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author andre
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
    
    static int soma2(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou...");
        soma(5,2); // O método soma só é executado aqui, quando chamado!
        System.out.println("Soma 2...");
        int s2 = soma2(6,3);
        System.out.println("A Soma 2, é: " + s2);
    }
    
}