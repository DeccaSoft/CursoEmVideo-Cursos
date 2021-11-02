/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um Número... ");
        n1 = teclado.nextInt();
        
        System.out.print("Digite outro Número... ");
        n2 = teclado.nextInt();
        
        r=(n1>n2)?n1:n2; //O operador ternário também aceita fórmulas
        System.out.println("O Maior Número é... "+r);
        
    }
    
}
