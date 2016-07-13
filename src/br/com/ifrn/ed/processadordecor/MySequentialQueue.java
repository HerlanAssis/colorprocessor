package br.com.ifrn.ed.processadordecor;


import br.com.ifrn.ed.processadordecor.Cor;
import java.util.NoSuchElementException;

public class MySequentialQueue implements Queue {

    private NodeQueue<Cor> first;
    private NodeQueue<Cor> last;
    private int size;

    public MySequentialQueue() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    @Override
    public void enqueue(Cor cor) {
        NodeQueue<Cor> oldLast = last;
        last = new NodeQueue<Cor>(cor);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.setProxNode(last);
        }
        size++;
    }

    @Override
    public Cor dequeue() {
        if (isEmpty()) {
             throw new NoSuchElementException("Queue underflow");
        }
        Cor cor = first.getElement();
        first = first.getProxNode();
        size--;
        
        if (isEmpty()) {
            last = null;
        }
        return cor;
    }

    @Override
    public Cor peek() {
        return first.getElement();
    }
    
    public String listarFila() {
        String result = "";
        NodeQueue<Cor> nodeQueue = first;
                
        for (int i = 0; i < size; i++) {
            Cor cor = nodeQueue.getElement();
            if (i < 1) {
                result += cor;
            } else {
                result += " + " + cor;
            }
            
            nodeQueue = nodeQueue.getProxNode();
        }
        return result;
    }        
}
