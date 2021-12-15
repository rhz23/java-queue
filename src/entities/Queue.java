package entities;

public class Queue {

    private Node refNodeQueueIn;

    public Queue() {
        this.refNodeQueueIn = null;
    }

    public boolean isEmpty() {
        return refNodeQueueIn == null ? true : false;
    }

    public void enqueue(Object object){
        Node newNode = new Node(object);
        newNode.setRefNode(refNodeQueueIn);
        refNodeQueueIn = newNode;
    }

    public Object first(){
        if(!this.isEmpty()){
            Node firstNode = refNodeQueueIn;
            while(true){
                if(firstNode.getRefNode() == null){
                    return firstNode.getObject();
                }
                else{
                    firstNode = firstNode.getRefNode();
                }
            }
        }
        else{
            return null;
        }
    }

    public Object dequeue(){
        if(!this.isEmpty()){
            Node firstNode = refNodeQueueIn;
            Node auxNode =  refNodeQueueIn;
            while(true){
                if(firstNode.getRefNode() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                }
                else{
                    auxNode.setRefNode(null);
                    return firstNode.getObject();
                }
            }
        }
        else{
            return null;
        }
    }

    @Override
    public String toString() {
        String returnString = "";
        Node auxNode = refNodeQueueIn;

        if (refNodeQueueIn != null){
            while (true){
                returnString += "[Node{object=" + auxNode.getObject() + "}]----->";
                if(auxNode.getRefNode() != null){
                    auxNode = auxNode.getRefNode();
                }
                else{
                    returnString += "null";
                    break;
                }
            }
        }else{
            returnString = "null";
        }

        return returnString;
    }
}
