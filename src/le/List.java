package le;

/**
 *
 * @author Phuc Hong Le
 */
public class List<E> {
    
    //fields
    private Node<E> front;
    private int count;
    
    public List(){
        this.front = new Node(null);
    }
    
    public void add(int index, E obj) {
        if (index < 0 || index > count) {
            return;
        }
        Node newNode = new Node(obj);
        Node prevNode = front;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.getNext();
        }
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
        count++;
    }
    
    public void remove(int index){
        
    }
    
    public int size(){
        return count;
    }

    @Override
    public String toString() {
        return "List{" + "front=" + front + ", count=" + count + '}';
    }
    
     
}
