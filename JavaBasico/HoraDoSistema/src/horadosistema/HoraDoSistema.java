/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author andre
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A Hora do Sistema é:");
        System.out.println(relogio.toString());
        
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do Sistema é:");
        System.out.print (idioma.getDisplayLanguage()+ "  "); System.out.println (idioma.getLanguage()); // imprime "Português" e depois imprime "pt"
        
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        System.out.println("Largura da Tela = " + d.width);
        System.out.println("Altura da Tela = " + d.height);
    }
    
}
