public class Stack {

    public int arr[];
    public int topOfStack;

    public Stack(int size){
        this.arr= new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created of the size "+ size);
    } 

    boolean isEmpty(){
        if(topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

     boolean isFull(){
        if(topOfStack == arr.length-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    public void Push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value has been successfully inserted");
        }
    }

public int pop(){
if(isEmpty()) {
    System.out.println("Stack is empty");
    return -1;
}
else{
    int topStack = arr[topOfStack];
    topOfStack--;
    return topStack;
    }

       
}


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return arr[topOfStack];
        }
    
 }
 public void deleteStack(){
    arr = null;
    System.out.println("The Stack is successfully deleted");
}
   

    
}
