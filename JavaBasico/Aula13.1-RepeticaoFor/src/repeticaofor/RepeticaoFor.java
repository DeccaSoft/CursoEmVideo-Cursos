/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author andre
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc=0; cc<=3; cc++){
            System.out.println("Cambalhota " + cc);
        }
        for (int cc2=10; cc2>=1; cc2 -= 2){
            System.out.println("Decrescendo em 2..." + cc2);
        }
        for (int a=1; a<=3; a++){
            for (int b=0; b<=2; b+=2){
                System.out.println("a =" + a + "b = " + b);
            }
        }
    }
    
}
