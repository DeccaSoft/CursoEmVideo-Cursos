/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;


/**
 *
 * @author andre
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE); //(NomeJanela, Menssagem, TítuloJanela, Ìcone)
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE); //(NomeJanela, Menssagem, TítuloJanela, Ìcone)
        JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE); //(NomeJanela, Menssagem, TítuloJanela, Ìcone)
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Número: ")); //Recebe algo
        JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);
        int x, s=0, tV=0, tP=0, tI=0, aC=0, mV=0;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um Número: <br><em>(Zero para Sair)...</em></html>"));
            s  += x;
            tV++;
            if(x%2==0){
                tP++;
            } else {
                tI++;
            }
            if (x>100){
                aC++;
            }
        } while (x!=0);
        mV=s/(tV-1); // -1 por causa do valor Zero que é digitado para sair
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr><br>Soma dos Valores: " + s + 
                "<br>Total de Valores Digitados: " + (tV-1)+ // -1 por causa do valor Zero que é digitado para sair
                "<br>Total de Números Pares: " + (tP-1) + // -1 por causa do valor Zero que é digitado para sair
                "<br>Total de NúmerosÍmPares: " + tI + 
                "<br>Total de Números Maiores que 100: " + aC + 
                "<br>Média dos Números Digitados: " + mV + "</html>");
        
        
    }
    
}
