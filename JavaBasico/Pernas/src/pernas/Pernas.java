/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas você tem? ");
        int perna = teclado.nextInt();
        String tipo;
        switch (perna){
            case 1: tipo="Saci"; break;
            case 2: tipo="Bípede"; break;
            case 3: tipo="Tripé"; break;
            case 4: tipo="Quadrúpede"; break;
            // case 6, 8: tipo="Aracnídeo"; break; // Também aceita, mas é Preview Future! Lembra?
            case 6: tipo="Aracnídeo"; break;
            case 8: tipo="Aracnídeo"; break;
            default: tipo="ET";
        }
        System.out.println("Você é: "+tipo);
    }
    
}
