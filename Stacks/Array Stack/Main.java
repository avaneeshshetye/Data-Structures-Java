/**
 * Main
 */
public class Main {
public static void main(String[]args){

    Stack newStack = new Stack(4);

    boolean result = newStack.isFull();
    System.out.println(result);

    newStack.Push(5);
    newStack.Push(8);

    int result1 = newStack.pop();
    System.out.println(result1);

    int result3 = newStack.peek();
   System.out.println(result3);

   newStack.deleteStack();
}


}