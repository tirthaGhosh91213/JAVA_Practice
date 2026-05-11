

public class DoublyLL {

    public class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Print Doubly Linked List
    public void printDLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;   
        }

        System.out.println("null");
    }
public void removeFirst(){
    if(head==null){
        System.out.println("Linked list is empty ");
    }
    else if (size==1){
        tail=head=null;
        size--;
    }
    else{
        head=head.next;
        head.prev=null;
        size--;
    }
}
public void reverse(){
    Node curr=head;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
    }
    head=prev;
} 
    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();

        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);

        dll.printDLL();
        // dll.removeFirst();
        dll.printDLL();
        dll.reverse();
        dll.printDLL();
    }
}