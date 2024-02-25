package LL_Questions.removedups;

public class Main {
    public static void main(String[]args){
        Questions qi = new Questions();
        qi.deleteDups(null);
        LinkedList li = new LinkedList();
        li.createLL(1);
        li.insertNode(4);
        li.insertNode(9);
        li.insertNode(3);
        li.insertNode(4);
        li.traversalLL();
    }
}
