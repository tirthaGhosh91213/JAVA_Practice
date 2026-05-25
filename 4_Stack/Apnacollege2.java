import java.util.Stack;

public class Apnacollege2 {
  public static void addBottom(Stack<Integer> s,int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top=s.pop();
    addBottom(s, data);
    s.push(top);

  }
  public static  void reverseString(String str){
    Stack<Character> s=new Stack<>();
    for(int i=0;i<str.length();i++){
      s.push(str.charAt(i));
    }
    StringBuilder result=new StringBuilder("");
    while(!s.isEmpty()){
      char ch=s.pop();
      result.append(ch);
    }
    System.out.println();
    System.out.println(result.toString());
  }
  public static void reverseStack(Stack<Integer> s){
    if(s.isEmpty()){
      return ;
    }
    int top=s.pop();
    reverseStack(s);
    addBottom(s,top);

  }
  public static void printStack(Stack<Integer> s){
    while(!s.isEmpty()){
      System.out.print(s.pop()+" ");
    }
  }
  public static void main(String[] args) {
      Stack<Integer> s=new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
      // addBottom(s,4);
      // while(!s.isEmpty()){
      //   System.out.print(s.pop()+" ");
        
      // }
    
      // reverseString("Tirtha");
      reverseStack(s);
      printStack(s);

  }
}
