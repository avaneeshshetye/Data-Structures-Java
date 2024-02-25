package circulardoublylinkedlist;

public class Circulardoublelinkedlist {
    public Node head;
    public Node tail;
    public int size;

    public Node createDoublyLinkedList(int nodeValue){
            head = new Node();
            Node node = new Node();
            node.value = nodeValue;
            head = node;
            tail = node;
            node.next  = node;
            node.prev = node;
            size = 1;

            return head;
     }

     public void insertCirculardoublyLinked(int nodeValue, int location){
        circulardoublylinkedlist node = new circulardoublylinkedlist();
        node.value = nodeValue;
        if(head == null){
            createDoublyLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            node.prev = tail;
            head.prev = new node;
            head = node
            tail.next = node;
        }

        else if(location >= size){
           node.next = head;
           node.prev = tail;
           tail.next = node;
           tail = node;
           head.prev = node;
        }

        else{
            tempNode = new Node();
            int index = 0;

            while(index < location-1){
                tempNode = tempNode.next();
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
            node.prev = tempNode;
        }
        size++;
     }

     public void traverseCirculardoublyLinkedlist(){
        Node tempNode = head;

        if(head = null){
            System.out.println(" CDLL does not exist");
            return;
        }

        for(int i=0;i<size;i++){
            System.out.println(tempNode.value);

                if(i != size-1){
                System.out.println(" -> ");
            }

            tempNode = tempNode.next;
        }
        }

        public boolean searchNode(int nodeValue){
            Node tempNode = head;

            for(int i=0;i<size;i++){
                if(nodeValue = tempNode.value){
                    System.out.pritntln(nodeValue+" is present at "+ i);
                    return true;
                }
                tempNode = tempNode.next;

                System.out.println("CDLL does not exist");
                return false;
            }
        }

        public void reversetraverseCirculardoublyLinkedlist(){
            Node tempNode = tail;
    
            if(head = null){
                System.out.println(" CDLL does not exist");
                return;
            }
    
            for(int i=0;i<size;i++){
                System.out.println(tempNode.value);
    
                    if(i != size-1){
                    System.out.println(" <- ");
                }
    
                tempNode = tempNode.prev;
            }

            public void deleteNodecircularDoublelinkedList(int location){
                if(head == null){
                    System.out.println("DLL does not exist");
                    return;
                }
                else if(location == 0){
                    head = head.next;
                    head.next.prev = tail;
                    tail.next = head;
                    size --;

                    if(size == 0){
                        head.prev = null;
                        head.next=null;
                        tail = null;
                        head = null;;
                    }
                    else if(location >= size){
                        Node tempNode = head;

                        for(int i=0;i<size-1;i++){
                           tempNode = tempNode.next;
                        }
                        tempNode.next = head;
                        head.prev = tempNode;
                        tail = tempNode;
                    }
                }
                size --;
            }
            }

            
        
    }

