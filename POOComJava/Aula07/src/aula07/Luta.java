/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Random;

/**
 *
 * @author andre
 */

/*Regras das lutas:
    - Lutadores devem ser da mesma categopria
    - Desfiado e desafiante devem ser lutadores diferentes, é claro!
    - Luta só acontece se Aprovada.
    - Rsultados possíveis: Vitória de um lutador ou empate
*/
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
         //Antes estava assim: if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2))
         //mas o NetBeans avisa para utilizar o equals, por se tratar de comparação de Strings
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("*** DESAFIADO ***");
            this.desafiado.apresentar();
            System.out.println("*** DESAFIANATE ***");
            this.desafiante.apresentar();
            
            /*Antes eu tinha feito assim...
            
            double resultado = (0 + Math.random() * (2-0));
            int vencedor = (int) (resultado);
            
            inclusive sem nem mesmo importar a Classe Random ... java.util
            
            Mas o tio Guanabara fez assim...
            */
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //Vai gerar três resultados (0, 1 ou 2)
            System.out.println("===== RESULTADO DA LUTA =====");
            switch(vencedor){
                case 0 :    System.out.println("Empate!!!");
                            this.desafiado.empatarLuta();
                            this.desafiante.empatarLuta();
                            break;
                case 1 : System.out.println("Desafiado Ganhou!!!");
                            System.out.println(desafiado.getNome());
                            this.desafiado.ganharLuta();
                            this.desafiante.perderLuta();
                            break;
                case 2 : System.out.println("Desafiante Ganhou!!!");
                            System.out.println(desafiante.getNome());
                            this.desafiado.perderLuta();
                            this.desafiante.ganharLuta();
                            break;
            }
            System.out.println("-----------------------------");
        }else{
            System.out.println("Luta não Aprovada!!!");
        }
    }

    //Métodos Especiais
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
