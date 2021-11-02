/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_heranca;

/**
 *
 * @author andre
 */
public class Aula10_Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");
        
        //p3.receberAum(550.20);
        //p4.mudarTrabalho();
        //p2.cancelarMatr();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
    }
    
}
