/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author andre
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "André";
        String nome2 = "André";
        String nome3 = new String("André");
        String nome4 = new String("André");
        String nome5 = "Andre";
        String nome6 = new String("Andre)");
        String res1, res2, res3, res4, res5;
        System.out.println("String André e String André");
        res1 = (nome1==nome2)?"Igual":"Diferenre";
        System.out.println(res1);
        System.out.println("String André e Classe André"); //São objetos diferentes
        res2 = (nome2==nome3)?"Igual":"Diferenre";
        System.out.println(res2);
        System.out.println("String André e String Andre");
        res3 = (nome2==nome5)?"Igual":"Diferenre";
        System.out.println(res3);
        System.out.println("Classe André e Classe Andre");
        res4 = (nome3==nome6)?"Igual":"Diferenre";
        System.out.println(res4);
        //Testando se o conteúdo dos objetos são iguais... através do equals
        System.out.println("String André e Classe André"); //São objetos diferentes
        res5 = (nome2.equals(nome3))?"Conteúdo Igual":"Conteúdo Diferenre";
        System.out.println(res5);
        
        
        
    }
    
}
