public class stack{
    int arr[];
    int topOfStack;
    Node head;
    Node tail;
    int size;

    stack(int[]size){
        this.arr = size;
        this.topOfStack = -1;
        System.out.println("Stack of size "+ size + "has been created");
    }

    public boolean isFull(){
        if(topOfStack == arr.length - 1){
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }

    public Node createNode(int nodeValue){
        Node node  = new Node();
        head = node;
        node.value = nodeValue;
        head = null;
        tail = null;
        size = 1;
        return head;
    
    }
    public void push(int nodeValue){
        Node node = new Node();
        nodeValue = node.value;

        if(head == null){
            createNode(nodeValue);
            return;
        }
            head = node;
            node.next = head;
            size ++;
 
    }

    public int peek(){
        if(isEmpty()){
           return -1;
        }
        return head.value;
    }

    public void pop(){
        if(head == null){
            return;
        }
        head = head.next;
        if(size == 0){
            tail = null;
        }
        size --;
    }
    
    public void delete(){
        arr = null;
    }

}