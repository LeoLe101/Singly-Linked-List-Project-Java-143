package le;

/**
 *
 * @author Phuc Hong Le
 */
public class List<E> {
    
    //fields
    private Node<E> front;
    private int count;
    
    //default constructor
    public List(){
        this.front = new Node(null);
    }
    
    //add method
    public void add(int index, E obj) {
        if (index < 0 || index > count) {
            return;
        }
        //this is a dummy Node
        Node newNode = new Node(obj);
        Node prevNode = front;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.getNext();
        }
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
        count++;
    }
    
    //remove method
    public void remove(int index){
        
    }
    
    //getting the size of the Linked List by counting next Node through count
    public int size(){
        return count;
    }

    //overide toString method
    @Override
    public String toString() {
        String output = "[ ";
        Node currNode = front;
        while(currNode.getNext() != null){
            currNode = currNode.getNext();
            output += "(" + currNode.getData() + ") ";
        }
        output += "]";
        return output;
    }
    
     
}
