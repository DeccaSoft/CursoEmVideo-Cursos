/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_herenca_2;

/**
 *
 * @author andre
 */
public class Aluno extends Pessoa{ //Herança para Diferença
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade de " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
