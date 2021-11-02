/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author andre
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(this.tipo=="cc"){ //O Java está pedindo para usar o equals... no segundo teste vou utilizar para observar como seria.
            this.setSaldo(50);
        }else if("cp".equals(this.tipo)){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com Sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Para se fechar uma Conta, a mesma precisa estar zerada!");//O ideal é que métodos não escrevam nada em tela!!!
        }else if (this.saldo<0){
            System.out.println("Conta com Saldo Devedor! Normalize a situação para poder ser fechada...");
        }else{
            setStatus(false);
            System.out.println("Conta Fechada com Sucesso!");
        }
    }
    
    public void depositar(double v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito de R$ "+v+" Realizado com Sucesso! Favorecido(a): "+this.getDono()+" Saldo Atual: "+this.getSaldo());
        }else{
            System.out.println("Conta Fechada! Impossível Depositar...");
        }
    }
    
    public void sacar(double v){
        if(this.isStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque de R$ "+v+" Realizado com Sucesso! Conta: "+this.getNumConta()+" Saldo Atual: "+this.getSaldo());
            }else{
                System.out.println("Saldo Insuficiente! Impossível Sacar...");
            }
        } else{
            System.out.println("Conta Fechada! Impossível Sacar...");
        }       
    }
    
    public void pagarMensal(){
        double v = 0;
        if(this.getTipo()=="cc"){
            v=12;
        }else if(this.getTipo()=="cp"){
            v=20;
        }else{
            System.out.println("Tipo de Conta Inválida!");
        }
        if (this.isStatus()) {
            if (this.getSaldo()>=v) {
                this.setSaldo(this.getSaldo()-v);
            } else {
                System.out.println("Saldo Insuficiente! Não é possível cobrar Manutenção agora...");
            }
        } else {
            System.out.println("Conat Fecha! Impossível cobrar Manutenção...");
        }
    }
    
    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Proprietário: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: Aberta? " + this.isStatus());
        System.out.println("----------------------------------------");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
