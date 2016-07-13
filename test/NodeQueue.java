public class NodeQueue<T> {
    private T element;
    private NodeQueue proxNode;
    
    public NodeQueue (T element){
        this.element = element;
        proxNode = null;
    }
    
    public NodeQueue (T element, T proxNode){
        this.element = element;
        this.proxNode = (NodeQueue) proxNode;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodeQueue getProxNode() {
        return proxNode;
    }

    public void setProxNode(NodeQueue proxNode) {
        this.proxNode = proxNode;
    }        
}