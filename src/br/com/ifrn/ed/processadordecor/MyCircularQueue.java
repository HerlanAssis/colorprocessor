package br.com.ifrn.ed.processadordecor;

import java.util.LinkedList;

public class MyCircularQueue {

    private LinkedList<Cor> cores;
    private Cor cor;

    public MyCircularQueue() {
        cores = new LinkedList();        
    }

    public void enqueue(Cor cor) {
        cores.add(cor);
    }

    public void enqueue(int tempo, String cor, int prioridade) {
        Cor novaCor = new Cor(tempo, cor, prioridade);
        cores.add(novaCor);
    }

    public Cor dequeue() {
        Cor cor = cores.removeFirst();        
        return cor;
    }

    public Cor firstElement() {
        return cores.getFirst();
    }

    public boolean isEmpty() {
        return cores.isEmpty();
    }

    public String listarFila() {
        String result = "";

        for (int i = 0; i < cores.size(); i++) {
            if (i < 1) {
                result += "[" + cores.get(i).getCor() + " | " + cores.get(i).getPrioridade() + " | " + cores.get(i).getTempo() + "s ]";
            } else {
                result += " + [" + cores.get(i).getCor() + " | " + cores.get(i).getPrioridade() + " | " + cores.get(i).getTempo() + "s ]";
            }
        }
        return result;
    }
}
