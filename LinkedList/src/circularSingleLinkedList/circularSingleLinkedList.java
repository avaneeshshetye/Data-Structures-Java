package circularSingleLinkedList;

public class circularSingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglecircularLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertSinglecircularLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            createSinglecircularLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        }
        else if(location >= size){
            tail.next = node;
            tail = node;
            tail.next = head; 
        }
        else{
           Node  tempNode = new Node();
           int index = 0;

           while(index < location -1){
            tempNode = tempNode.next;
            index++;
           }
           Node nextNode = tempNode.next;
           tempNode.next = node;
           node.next = nextNode;
    
        }

        size++;
    }

    public void traverse(){
        if(head == null){
            System.out.println("SLL does not exist");
            return;
        }
        else{
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.println(tempNode.value);
                if(i!=size-1){
                    System.out.println(" ->  ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public boolean searchNode(int nodeValue){
        if(head!=null){
            Node  tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.value == nodeValue){
                    System.out.println(nodeValue+" is present at node "+ i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
        
    }

    public void deleteNode(int location){
        if(head == null){
            System.out.println("SLL does not exist");
            return;
        }
        else if(location == 0){
            head = head.next;
            
            if(size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
            else if(location >= size){
               Node tempNode = head;
               int index = 0;

               for(index=0;index<size-1;index++){
                tempNode = tempNode.next;
                index++;
            }
            if(tempNode == head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }
        else{
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size --;
        }
    }


}
}