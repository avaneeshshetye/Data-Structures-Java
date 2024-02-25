public class QueueArray {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;


    public QueueArray(int size){
        this.arr = new int [size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;

        System.out.println("A queue of size " + size + " is generated");
    }

    public boolean isFull(){
        if(topOfQueue == arr.length - 1){
            System.out.println("Queue is Full");
            return true;   
        }
        return false;
    }

    public boolean isEmpty(){
        if(beginningOfQueue == -1){
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()){
        beginningOfQueue = 0;
        topOfQueue++;
        arr[topOfQueue] = value;
        System.out.println(value + " Has beeen added to the queue");
    }
    else if(isEmpty()){
        topOfQueue++;
        arr[topOfQueue] = value;
        System.out.println(value + " Has beeen added to the queue");
}
    }

    public void peak(){
        System.out.println(arr[topOfQueue] + "is the value");
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        int result = arr[beginningOfQueue];
        beginningOfQueue++;


        if(beginningOfQueue > topOfQueue){
            beginningOfQueue = topOfQueue = -1;
        }
        System.out.println(result + " has been dequeued");

    }



}
