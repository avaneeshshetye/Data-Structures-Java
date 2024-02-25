package singleLinkedList;

public class Main {
    public static void main(String[] args) {
        Singlylinkedlist obj1 = new Singlylinkedlist();
        obj1.createlinkedlist(5);
        obj1.insertInLinkedList(6, 4);
        obj1.insertInLinkedList(8, 5);
        obj1.insertInLinkedList(11, 6);
        obj1.traverseLinkedlist();
        obj1.searchNode(8);
        obj1.searchNode(68);
        obj1.deleteNode(1);
        
        
    }
    
}
