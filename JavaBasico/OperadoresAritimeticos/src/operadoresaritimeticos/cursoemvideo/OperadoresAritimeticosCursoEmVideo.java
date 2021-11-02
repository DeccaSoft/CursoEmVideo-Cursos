/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos.cursoemvideo;

/**
 *
 * @author andre
 */
public class OperadoresAritimeticosCursoEmVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=3;
        int n2=5;
        float m=(n1+n2)/2;
        System.out.println("A média é igual a: "+m);
        
        int numero=5;
        numero++;
        System.out.print("5++ = ... ");
        System.out.println(numero);
        int numero2 = --numero;
        //int numero2=5;
        //numero2--;
        System.out.print("--6 = ... ");
        System.out.println(numero2);
        System.out.println("n=5 ; v=5+n++");
        numero=5;
        int valor=5+numero++;
        System.out.print("v = ... ");
        System.out.println(valor);
        System.out.print("n = ... ");
        System.out.println(numero);
        
        System.out.println("a=5 ; b=5+ ++a");
        int a=5;
        int b=5+ ++a;
        System.out.print("a = ... ");
        System.out.println(a);
        System.out.print("b = ... ");
        System.out.println(b);
        
        int x=4;
        System.out.print("x=4; x+=2 = ... ");
        x+=2; // x=x+2
        System.out.println(x);
        //Vale pra todos os operadores +=, -=, *=, /=, %=
        
        System.out.println("Arredondamentos");
        float v1 = 8.9f;
        int ar = (int) Math.floor(v1); 
        System.out.println("8,9 para baixo... " + ar);
        float v2 = 9.3f;
        int ar2 = (int) Math.ceil(v2);
        System.out.println("9,3 para cima... " + ar2);
        float v3 = 5.5f;
        System.out.println("5,5 para baixo, cima e aritimeticamente... respectivamente");
        int ar3 = (int) Math.floor(v3); 
        int ar4 = (int) Math.ceil(v3);
        int ar5 = (int) Math.round(v3);
        System.out.println(ar3);
        System.out.println(ar4);
        System.out.println(ar5);
        
        System.out.println("Randomico");
        double ale = Math.random();
        System.out.println(ale);
        System.out.println("Entre 5 e 10");
        System.out.println(5 + Math.random() * (10-5));
        System.out.println("Entre 0 e 9");
        System.out.println(0 + Math.random() * (9-0));
        System.out.println("Continuando...");
        
        double j = Math.random();
        int k = (int) (4 + j * (6-4));
        System.out.println("Inteiro entre 4 e 6");
        System.out.println(k);
        
    }
    
}
