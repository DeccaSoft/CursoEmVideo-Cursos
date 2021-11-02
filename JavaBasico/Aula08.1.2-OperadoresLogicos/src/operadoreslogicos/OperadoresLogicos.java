/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author andre
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x=4; y=7; z=12;
        boolean r;
        
        r=(x<y && y<z)?true:false;
        System.out.println("X=4; Y=7; Z=12");
        System.out.println("X<Y<Z "+r);
        r=(x<y || y==z)?true:false;
        System.out.println("X<Y ou Y=Z "+r);
         r=(x<y ^ y<z)?true:false;
        System.out.println("X<Y ou ou Y<Z "+r);
        
    }
    
}
