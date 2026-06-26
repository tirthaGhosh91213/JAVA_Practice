
import java.util.Deque;
import java.util.LinkedList;

public class StackByDeque {
  public static  class Stack{
    Deque<Integer> dq=new LinkedList<>();
    public void push(int data){
      dq.addLast(data);
    }
    public int pop(){
      return dq.removeLast();
    }
    public int peek(){
      return dq.getFirst();
    }
  }
  public static class Queue{
    Deque<Integer> dq= new LinkedList<>();
    public void add(int data){
      dq.addLast(data);
    
    }
    public int remove(){
      return dq.removeFirst();
    }
    public int peek(){
      return dq.getFirst();
    }
  }
  public static void main(String[] args) {
   /*  Stack s=new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println("The first element is :- "+s.peek());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    */
   Queue q=new Queue();
   q.add(1);
   q.add(2);
   q.add(3);
    System.out.println("The first element is :- "+q.peek());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
  }
}
