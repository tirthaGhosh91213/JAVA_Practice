
public class ApnaCollege {
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  // Add data at first in liklist 
public void addFirst(int data){
  // create a new node 
  Node newNode=new Node(data);
  size++;

  if(head==null){
    head=tail=newNode;
    return;
  }
  newNode.next=head;
  head=newNode;

}
// Add data at last in linklist 
public void addLast(int data){
  Node newNode=new Node(data);
  size++;
  if(head==null){
    head=tail=newNode;
    return;
  }
  tail.next=newNode;
  tail=newNode;
}
public  void addMiddle(int data , int idx){
  Node newNode=new Node(data);
  size++;
  Node temp=head;
  for(int i=0;i<idx-1;i++){
    temp=temp.next;
  }
newNode.next=temp.next;
  temp.next=newNode;
}

public int removeFirst(){
  if(size==0){
    System.out.println("Empty linklist");
  }else if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;
    return val;
  }
  int val=head.data;
  head=head.next;
  size--;
  return val;
}
public int removeLast(){
  int val=tail.data;
  Node prev=head;
  for(int i=0;i<size-2;i++){
    prev=prev.next;
  }
  prev.next=null;
  tail=prev;
  size--;
  return val;
}
public void printLL(){
  Node temp=head;
  while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
  }
  System.out.println();
}

public int LinerSearch(int key){
int i=0;
Node temp=head;
while(temp!=null){
  if(temp.data==key){
    return i;
  }
temp=temp.next;
i++;
}
return -1;
}
public int helper(Node head,int key){
  if(head==null){
    return -1;
  }
  if(head.data==key){
    return 0;
  }
  int idx=helper(head.next, key);
  if(idx==-1){
    return -1;
  }
  return idx+1;
}
public int recSearch(int key){
  return helper(head, key);
}

  public static void main(String[] args) {
    ApnaCollege ll=new ApnaCollege();
    ll.addFirst(10);
    ll.addFirst(20);
    ll.addLast(3);
    ll.addLast(5);
    // ll.printLL();
    ll.addFirst(90);
    ll.addMiddle(85, 4);
    ll.printLL();
    ll.removeFirst();
    ll.printLL();
    ll.removeLast();
    ll.printLL();

    System.out.println("The index is :-  "+ll.LinerSearch(3));
    System.out.println("The index is :-  "+ll.recSearch(10));
    // System.out.println(size);
  }
}
