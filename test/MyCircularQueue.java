import br.com.ifrn.ed.processadordecor.Cor;

public class MyCircularQueue implements Queue {

    private NodeQueue<Cor> first;
    private NodeQueue<Cor> last;
    private int size;

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
    public void enqueue(Object obj) {
        NodeQueue nodeQueue = new NodeQueue(obj);

        if (isEmpty()) {
            first = nodeQueue;
            last = nodeQueue;
            last.setProxNode(nodeQueue);
        } else {
            nodeQueue.setProxNode(first);
            last.setProxNode(nodeQueue);
            last = nodeQueue;
        }

        size++;
    }

    @Override
    public Object dequeue() {
        Object object;
        
        if(isEmpty()){
             object= null;
        }else if(size == 1){
            object = first;
            first = last = null;
        }else{
            object = first;
        }
                        
        size--;
        
        return object;
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
