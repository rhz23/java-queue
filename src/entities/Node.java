package entities;

public class Node<T> {

    private T object;
    private Node<T> refNode;

    public Node(){
    }

    public Node(T object){
        this.refNode = null;
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
