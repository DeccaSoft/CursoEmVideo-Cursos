/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voto;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Voto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2020-nasc;
        System.out.println("Sua idade é " + i + " anos.");
        if (i<16){
            System.out.println("Não Vota");
        }else if ((i>=16 && i<18)||(i>70)){
            System.out.println("Voto Opcional");
        }else {
            System.out.println("Voto Obrigatório");
        }
    }
}
