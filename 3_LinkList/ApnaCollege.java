


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
public static void printLL(){
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
public void reverse(){
  Node prev=null;
  Node curr=tail=head;
  Node  Next;
  while(curr!=null){
  Next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=Next;
  }
  head=prev;
}
public void removeFromEnd(int n){
  int sz=0;
  Node temp=head;
  while(temp!=null){
    temp=temp.next;
    sz++;
  }
  if(n==sz){
    head=head.next;
    return;
  }
  int i=1;
  Node prev=head;
  while(i<sz-n){
    prev=prev.next;
    i++;

  }
  prev.next=prev.next.next;
  return;

}
public Node findMid(Node head){
  Node slow=head;
  Node first=head;
  while(first!=null && first.next!=null){
    slow=slow.next;
    first=first.next.next;
  }
  return slow;
}
public boolean palindrome(){
  if(head==null || head.next==null){
    return true;
  }
  Node mid=findMid(head);

  Node prev=null;
  Node curr=mid;
  Node next;
  while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;

  }
  Node right=prev;
  Node left=head;
  while(right!=null){
    if(right.data!=left.data){
      return false;
    }
    right=right.next;
    left=left.next;
  }
  return true;
}
public static boolean CheckCyele(){
  Node slow=head;
  Node fast=head;
  while(fast!=null&& fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow){
      return true;
    } 
  }
  return false;
}
public static void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    // Detect Cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            cycle = true;
            break;
        }
    }

    // No cycle
    if (!cycle) {
        return;
    }

    // Find cycle start
    slow = head;
    Node prev = fast;

    // Special case: cycle starts from head
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Move prev to last node of cycle
    while (prev.next != slow) {
        prev = prev.next;
    }

    // Remove cycle
    prev.next = null;
}
public Node getMid(Node head){
  Node slow =head;
  Node fast=head.next;
  while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
  }
  return slow;
}
public Node merge(Node newLeft, Node newRight){
  Node mergedLL=new Node(-1);
  Node temp=mergedLL;
  while(newLeft!=null&& newRight!=null){
    if(newLeft.data<=newRight.data){
      temp.next=newLeft;
      newLeft=newLeft.next;
      temp=temp.next;

    }else{
      temp.next=newRight;
      newRight=newRight.next;
      temp=temp.next;
    }
  }
  while(newLeft!=null){
     temp.next=newLeft;
      newLeft=newLeft.next;
      temp=temp.next;
  }
  while(newRight!=null){
       temp.next=newRight;
      newRight=newRight.next;
      temp=temp.next;
  }
  return mergedLL.next;
}


public Node mergedSort(Node head){
  if(head==null||head.next==null){
    return head;
  }
  Node mid=getMid(head);

  Node rightHead=mid.next;
  mid.next=null;
  Node newRight=mergedSort(rightHead);
  Node newLeft=mergedSort(head);

  return merge(newLeft,newRight);

}
  public static void main(String[] args) {
    ApnaCollege ll=new ApnaCollege();
    // ll.addFirst(10);
    // ll.addFirst(20);
    // ll.addLast(3);
    // ll.addLast(5);
    // // ll.printLL();
    // ll.addFirst(90);
    // ll.addMiddle(85, 4);
    // ll.printLL();
    // ll.removeFirst();
    // ll.printLL();
    // ll.removeLast();
    // ll.printLL();

    // System.out.println("The index is :-  "+ll.LinerSearch(3));
    // System.out.println("The index is :-  "+ll.recSearch(10));
    // ll.reverse();
    // ll.printLL();
    // ll.removeFromEnd(2);
    // ll.printLL();
    // System.out.println(size);
    // ll.addFirst(1);
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.printLL();
    // System.out.println(ll.palindrome());
    // System.out.println(ll.CheckCyele());
  //   head=new Node(1);
  //   head.next=new Node(2);
  //   head.next.next=new Node(3);
  //   head.next.next.next=head;
  //  System.out.println(CheckCyele());
  //   removeCycle();
  ll.addFirst(1);
  ll.addFirst(5);
  ll.addFirst(4);
  ll.addFirst(2);
  // ll.addFirst(3);
  printLL();
  ll.head=ll.mergedSort(ll.head);
  // ll.mergedSort(ll.head);
  printLL();

  }
}
