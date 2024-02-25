package doubleLinkedList;

public class DoubleLinkedlist{
public Node head;
public Node tail;
public int size;

public Node create(int nodeValue){
    head = new Node();
    Node node  = new Node();
    node.value = nodeValue;
    node.next = null;
    node.prev = null;
    head = node;
    tail = node;
    size = 1;
    return head;
}

public void insert(int nodeValue, int location){
    head = new Node();
    Node node = new Node();

    if(head == null){
        create(nodeValue);
        return;
    }

    else if(location == 0){
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }
    else if(location >= size){
        node.next = null;
        node.prev = tail;
        tail.next = node;
        tail = node;
    }
    else{
        Node tempNode = head;
        int index = 0;

        while(index < location-1){
            tempNode = tempNode.next;
            index++;
        }

        node.prev = tempNode;
        node.next = tempNode.next;
        tempNode.next = node;
        tempNode.next.prev = node;
    }
    size++;
}

public void traverse(){
    if(head == null){
        System.out.println("DLL does not exist");
        return;
    }
    else{
        Node tempNode = head;

        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            
            if(i != size-1){
                System.out.print(" -> ");
            }
        }
        tempNode = tempNode.next;
    }
}

public void revtraversal(){
    if(head == null){
        System.out.println("SLL does not exist");
        return;
    }
    else{
        Node tempNode = tail;
       
        for(int i=0;i<size;i++){
            System.out.println(tempNode.value);

            if(i != size-1){
                System.out.print(" <- ");
            }
        }
        tempNode = tempNode.prev;

    }
}

    /**
     * @param nodeValue
     * @return
     */
    public boolean searchNode(int nodeValue){
        if(head!=null){
           Node tempNode  = head;

           for(int i=0;i<size;i++){
            
            if(tempNode.value == nodeValue){
                System.out.println(nodeValue + " is present at location " + i);
                return true;
            }
            tempNode = tempNode.next;
           }
           
          

        }
        System.out.println("No such node");
        return false;
    
}

public void deleteNode(int location){
    Node tempNode =  head;
    if(head == null){
        System.out.println("DLL does not exist");
        return;
    }
    else if(location == 0){
        head = head.next;
        head.prev = null;
        size -- ;

        if(size == 0){
            tail = null;
            return;
        }
    }

    else if(location >= size){
        
        for(int i=0; i<size-1;i++){
            tempNode = tempNode.next;
        }

        if(tempNode == head){
            tail = head = null;
            size--;
            return;
        }
        tempNode.next = null;
        tail = tempNode;
        size--;
    }

    else{
        for(int i=0; i<location-1;i++){
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        tempNode.next.prev = tempNode;
        size--;
    }
}

public void deleteall(){
    Node tempNode = head;

    for(int i=0;i<size;i++){
        tempNode.prev = null;
        tempNode = tempNode.next;
    }
    head = null;
    tail = null;

    System.out.println("DLL has been deleted");
}


}
