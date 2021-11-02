/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.questãomarinha;

/**
 *
 * @author andre
 */
public class TesteQuestãoMarinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        //Qual dos comandos abaixo compila sem erro?
        
        //c = c + 1; // Erro
        s += 1; System.out.println(s);
        //i += s; //Erro
        //c += s; //Erro
        i += l; System.out.println(i); //Inteiro pode receber long... se esse long for (UM)
        i += 2; System.out.println(i);
        i += 10; System.out.println(i); //Funcionou em outros casos!!!
        
        
        
    }
    
}
