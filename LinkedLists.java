package linked.lists;

import java.util.LinkedList;

public class LinkedLists {
    
    private Node head;
    
    public LinkedLists(){
        this.head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void insert(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            this.head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public Node DeleteFirst(){
        if(isEmpty()){
            System.out.println("List is empty.");
            return null;
        }
        Node temp = head;
        head = head.next;
        return temp;
    }
    
    public void displayList(){
        if(isEmpty()){
            System.out.println("List is empty.");
            return;
        }
        
        Node current = head;
        
        while(current != null){
            current.displayNode();
            current = current.next;
        }
    }
    
    public Node find(int key){
        Node current = head;
        while(current.next!= null){
            if(current.item==key){
                break;
            }
            else
                current = current.next;
        }
        if (current.item== key){
            System.out.println("Item is found.");
            return current;
        }
        else{
            System.out.println("Item not found.");
            return null;
        }
    }
    
    public void delete(int key){
        Node prevNode = null;
        Node currNode = head;
        
        while(currNode !=null && currNode.item != key){
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(currNode == head){
            head = head.next;
            System.out.println("Head node deleted.");
        }
        else{
            if(currNode== null){
                System.out.println("A node with that value does not exist.");
            }
            else{
                System.out.println("A node with the value " +  currNode.item + " deleted");
                prevNode.next = currNode.next;
            }
        }
    }
    
    public int size(){
        int size =0;
        Node current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public static void main(String[] args) {
        
        LinkedLists myList = new LinkedLists();
        
        System.out.println("Is list Empty ? " + myList.isEmpty());
        
        myList.insert(22);
        myList.insert(23);
        myList.insert(76);
        myList.insert(54);
        myList.insert(45);
        myList.insert(61);
        myList.insert(32);
        myList.insert(67);
        
        
        myList.displayList();
        myList.DeleteFirst();
        myList.displayList();
    }
    
}
