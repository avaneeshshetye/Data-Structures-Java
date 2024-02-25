/**
 * Main
 */
public class Main {

    public static void main(String[]args){
        BinarySearchTree newBst = new BinarySearchTree();
        newBst.insert(70);
        newBst.insert(80);
        newBst.insert(30);
        newBst.insert(40);
        newBst.insert(21);
        newBst.insert(17);
        newBst.preOrder(newBst.root);
        newBst.inOrder(newBst.root);
        newBst.postOrder(newBst.root);

    }   
}