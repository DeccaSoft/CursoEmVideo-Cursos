
package aula03;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga = 1;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta " + this.modelo + " de cor " + this.cor + " e ponta " + this.ponta + " com carga " 
                + this.carga + " foi criada! Ela está tampada? " + this.tampada);
        //this é o nome do objeto que chamou... no caso c1;
    }
    
    public void rabiscar(){
        if (this.tampada==true){
            System.out.println("Caneta Tampada! Não posso Rabiscar... Destampe primeiro.");
        }else{
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar(){
        this.tampada = true;
        System.out.println("Caneta Tampada...");
    }
    
    public void destampar(){
        this.tampada = false;
        System.out.println("Caneta Destampada...");
    }
    
}
