/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author andre
 */
public class ControleRemoto implements Controlador{ // Implementando Controlador
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //Não é o ideal, mas os métodos get e set estão privados propositalmente

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos (Sobrescrevendo)

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------MENU--------");
        System.out.println("Está Ligado? "+this.isLigado());
        System.out.println("Está Tocando? "+this.isTocando());
        System.out.print("Volume: "+this.getVolume());
        for(int i=1; i <= this.getVolume(); i += 10){
            System.out.print(" / ");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu Fechado!");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Estou Desligado! Impossível aumentar volume...");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Estou Desligado! Impossível diminuir volume...");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
        }else{
            System.out.println("Impossível! Ou estou desligado ou já estou mudo...");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("Impossível! Ou estou desligado ou não estou mudo...");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Impossível dar Play! Ou estou desligado ou já estou tocando...");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Impossível dar Pause! Ou estou desligado ou já estou em modo pause...");
        }
    }
    
  
}
