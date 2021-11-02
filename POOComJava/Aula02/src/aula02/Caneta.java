
package aula02;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga = 1;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.modelo + " de cor " + this.cor + " e ponta " + this.ponta + " com carga " 
                + this.carga + " foi criada! Ela está tampada? " + this.tampada);
        //this é o nome do objeto que chamou... no caso c1;
    }
    
    void rabiscar(){
        if (this.tampada==true){
            System.out.println("Caneta Tampada! Não posso Rabiscar... Destampe primeiro.");
        }else{
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar(){
        this.tampada = true;
        System.out.println("Caneta Tampada...");
    }
    
    void destampar(){
        this.tampada = false;
        System.out.println("Caneta Destampada...");
    }
    
}
