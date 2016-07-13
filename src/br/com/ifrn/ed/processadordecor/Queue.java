package br.com.ifrn.ed.processadordecor;

public interface Queue{
    public int size();
    public boolean isEmpty();    
    public void enqueue(Cor cor); 
    public Cor dequeue();
    public Cor peek();
}
