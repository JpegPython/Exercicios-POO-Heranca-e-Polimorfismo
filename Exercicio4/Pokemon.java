package Exercicio4;

import Exercicio2.Pessoa;

import java.util.ArrayList;

public class Pokemon {
    protected String nome;
    protected String tipo;
    protected float tamanho;
    protected float peso;
    protected float xp;
    protected Status stats=new Status();
    protected ArrayList<Ataque> ataques=new ArrayList<Ataque>();


    public void evolucao(Status evstatus, float tamanho, float peso){
        if(this.xp>=100){
            this.xp=0;
            this.stats=new Status();
            this.tamanho=tamanho;
            this.peso=peso;
        }
        else
            System.out.println("Não tem a experiencia necessaria");
    }

}
