import java.util.*;

public class StackByQueue {
  static class Stack{
    static Queue<Integer> s1=new LinkedList<>();
    static Queue<Integer> s2=new LinkedList<>();

    public static boolean isEmpty(){
      return s1.isEmpty() && s2.isEmpty();
    }
    public static void push(int data){
      if(!s1.isEmpty()){
        s1.add(data);
      }else{
        s2.add(data);
      }
    }
    public static int pop(){
      if(isEmpty()){
        System.out.println("Queue is eampty ");
        return -1;
      }
      int top=-1;
      if(!s1.isEmpty()){
        while(!s1.isEmpty()){
          top=s1.remove();
          if(s1.isEmpty()){
            break;
          }
          s2.add(top);
        }
        
      }else{
        if(!s2.isEmpty()){
        while(!s2.isEmpty()){
          top=s2.remove();
          if(s2.isEmpty()){
            break;
          }
          s1.add(top);
        }
        
      }
      }
      return top;
    }
    public static int peek(){
      if(isEmpty()){
        System.out.println("Queue is eampty ");
        return -1;
      }
      int top=-1;
      if(!s1.isEmpty()){
        while(!s1.isEmpty()){
          top=s1.remove();
          s2.add(top);
        }
        
      }else{
        if(!s2.isEmpty()){
        while(!s2.isEmpty()){
          top=s2.remove();
          s1.add(top);
        }
        
      }
      }
      return top;
    }


  }
  public static void main(String[] args) {
    Stack s =new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    while(!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();
    }
  }
}
