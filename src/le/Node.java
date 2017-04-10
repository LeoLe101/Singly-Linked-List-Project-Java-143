package le;

/**
 *
 * @author Phuc Hong Le
 */
public class Node<E> {
    
    //fields
    private E data;
    private Node next;
    
    //default constructor
    Node (E data){
        this.data = data;
    }

    //setter annd getter for the Node
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
