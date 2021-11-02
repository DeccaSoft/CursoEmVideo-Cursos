/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author andre
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc=0;
        while (cc<4){
            System.out.println("Cambalhota!!! "+(cc+1));
            cc++;
        }
        //Começa com o contador em 1
        int cc2=1;
        while (cc2<=4){
            System.out.println("Cambalhota!!! "+cc2);
            cc2++;
        }
        int cc3=0;
        while (cc3<10){
            cc3++;
            if (cc3==3 || cc3==6 || cc3==9){
                System.out.println("Paradinha para descanso...");
                continue;
            }
            System.out.println("Cambalhota!!!"+cc3);
        }
        int cc4=0;
        while (cc4<=10){
            cc4++;
            if (cc4==10){
                System.out.println("Dez cambalhotas seguidas, eu não aguento!!!");
                break;
            }
            System.out.println("Cambalhota!!!"+cc4);
        }
    }
        
}

