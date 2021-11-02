/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author andre
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Testar o ano atual se é bissexto para por 29 dias em fevereiro.
        Calendar hoje = Calendar.getInstance();
        System.out.println("Ano do Sistema: " + hoje.get(Calendar.YEAR));
        int ano = hoje.get(Calendar.YEAR);
        if (ano%4==0){
            tot[1]=29;
        }
        for (int c=0; c<mes.length; c++){
            System.out.println("O mês " + mes[c] + " tem " + tot[c] + " dias.");
        }
    }
    
}
