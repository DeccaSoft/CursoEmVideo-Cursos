
package aula04;

public class Aula04 {


    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("BIC", 0.5f, "Azul");
        //c1.setModelo("BIC"); // mesmo que: c1.modelo = "BIC"; porque o atributo estava public
        //c1.setPonta(0.5f);
        System.out.println("Foi feita uma caneta!!!");
        c1.status();
        System.out.println("Foi feita uma caneta!!!");
        Caneta c2 = new Caneta("Compactor", 0.7f, "Vermelha");
        c2.status();
    }
    
}
