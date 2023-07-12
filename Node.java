package linked.lists;

public class Node {
    
    public int item; // Data
    public Node next; // Reference to the next node
    
    public Node(int value){
        this.item = value;
        this.next = null;
    }
    
    public void displayNode(){
        System.out.println(item);
    }
    
    
}
