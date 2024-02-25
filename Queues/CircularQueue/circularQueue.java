package CircularQueue;

/**
 * circularQueue
 */
public class circularQueue {

    int [] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public circularQueue(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("Circular Array of size " + size + " has been created");
    }

    public boolean isEmpty(){
        if(topOfQueue == -1){
            System.out.println("Empty");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(topOfQueue + 1 == beginningOfQueue){
            return true;
        }
        else if(beginningOfQueue == 0 && topOfQueue+1 == size){
            return true;
        }
        return false;
    }

    

}