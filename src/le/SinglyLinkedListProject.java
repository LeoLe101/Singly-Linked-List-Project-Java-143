package le;

/**
 *
 * @author Phuc Hong Le
 */
public class SinglyLinkedListProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, i);
        }
        System.out.println(list);
    }
    
}
