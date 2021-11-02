
package aula02;


public class Aula02 {

   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        
        System.out.println("-----------------");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "Vermelha";
        c2.ponta = 0.5f;
        c2.status();
        c2.rabiscar();
        c2.tampar();
        
        
    }
    
}
