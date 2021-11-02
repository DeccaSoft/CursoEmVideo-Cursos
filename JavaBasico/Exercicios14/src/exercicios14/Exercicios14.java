/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios14;

/**
 *
 * @author andre
 */
public class Exercicios14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {2,0,3,9};
        v[v[2]]=v[v[1]]; //v[2]=3 ... v[v[2]]=v[3] || v[1]=0 ... v[v[1]]=v[0]=2 :: v[v[2]]=2
        for (int i: v){
            System.out.print(i);
        }
        
        System.out.println("");
        
        String s = "CURSOEMVIDEO";
        char[] r = new char[12]; // ATENÇÃO: Uma String NÃO é um vetor de char.
        for (int c=s.length()-1; c>=0; c--){
            r[c] = s.charAt(c);
        }
        for (char x: r){
            System.out.print(x);
        }
    }
    
}
