package br.com.ifrn.ed.processadordecor;

import java.util.NoSuchElementException;

/**
 * 
 * @author Herlan & Sávio
 * Classe responsávio pela fila circular.
 */
public class MyCircularQueue implements Queue {

    private NodeQueue<Cor> first;//primeiro nó
    private NodeQueue<Cor> last;//último nó
    private int size;//tamanho

    public MyCircularQueue() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return first == null && last == null;
    }

    @Override
    public void enqueue(Cor cor) {
        NodeQueue<Cor> newNode = new NodeQueue<Cor>(cor);//aloca um novo nó

        if (isEmpty()) {
            /*Caso a fila seja vazia o primeoro nó será igual ao último e o ultimo vai apontar para o primeiro*/
            first = last = newNode;
            last.setProxNode(first);
        } else {
            /*Caso a fila já possua elementos o novo elemento adicionado vai apontar para o primeiro e ele será o ultimo*/
            newNode.setProxNode(first);
            last.setProxNode(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public Cor dequeue() {
        Cor cor;

        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        } else if (first == last) {
            /*Caso exista apenas um único elemento o primeiro e o último serão nulos após a remoção*/
            cor = first.getElement();
            first = last = null;
        } else {
            /*Caso exista mais de um elemento só basta mover a referência do primeiro e redicionar o apontador do ultimo*/
            cor = first.getElement();
            first = first.getProxNode();
            last.setProxNode(first);
        }

        size--;

        return cor;
    }

    @Override
    public Cor peek() {
        return first.getElement();
    }

    public NodeQueue node() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        return first;
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
