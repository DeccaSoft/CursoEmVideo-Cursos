/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author andre
 */
public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    //private String nacionalidade;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    //private double peso;
    //private String categoria;
    //private int vitorias;
    //private int derrotas;
    //private int empates;
    
    //Construtor
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso<52.2){
            this.categoria = "Inválido";
        }else if(peso<=70.3){
            this.categoria = "Leve";
        }else if(peso<=83.9){
            this.categoria = "Médio";
        }else if (peso<=120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
    //Métodos Públicos
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
        //Poderia ser assim...
        //this.vitorias = this.vitorias + 1;
    }
    
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
    
    public void apresentar(){
        System.out.println("-----Apresentando-----");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos.");
        System.out.println("Altura: " + getAltura() + " m.");
        System.out.println("Pesando: " + getPeso() + " Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    
    public void status(){
        System.out.println(" * " + getNome() + "Cat.: " + getCategoria() + " => " + getVitorias() + " Vit. / " + getDerrotas() + " Der. / " + getEmpates() + " Emp.");
    }
}
