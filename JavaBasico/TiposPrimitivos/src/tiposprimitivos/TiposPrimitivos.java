/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float nota = 8.5f;
        String nome = "André";
        
        System.out.println("Digite o nome...");
        String nome2 = teclado.nextLine();
        
        System.out.println("Digite a Nota");
        float nota2 = teclado.nextFloat();
        
        System.out.println("Digite sua Idade");
        int idade = teclado.nextInt();
        
        System.out.print("Teste!!!"); //Não pula linha
        System.out.println("A nota é: " + nota); // Salta Linha
        System.out.printf("A nota formatada é %.2f \n", nota); //Formata a saída... \n salta a linha
        System.out.printf("A nota de %s é %.2f \n", nome2, nota2); //Duas formatações
        System.out.format("A idade é %s \n", idade);
    }
    
}
