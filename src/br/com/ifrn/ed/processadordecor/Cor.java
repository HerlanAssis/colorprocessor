package br.com.ifrn.ed.processadordecor;

public class Cor {

    private int tempo;
    private String cor;
    private int prioridade;

    public Cor(int tempo, String cor, int prioridade) {
        this.tempo = tempo;
        this.cor = cor;
        this.prioridade = prioridade;                
    }

    public int getTempo() {
        return tempo;
    }

    public String getCor() {
        return cor;
    }
    
    public int getPrioridade(){
        return prioridade;
    }
}