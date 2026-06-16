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
public static void spanStock(int stock[],int span[]){
  Stack<Integer> s=new Stack<>();
  span[0]=1;
  s.push(0);
  for(int i=1;i<stock.length;i++){
    int currentPrice=stock[i];
    while(!s.isEmpty() && currentPrice>=stock[s.peek()]){
      s.pop();
    }
    if(s.isEmpty()){
     span[i]=i+1;
    }else{
      int prevHigh=s.peek();
      span[i]=i-prevHigh;

    }
    s.push(i);
  }
}
public static void nextGreater(int arr[],int nextGreater[]){
Stack<Integer> s=new Stack<>();
for(int i=arr.length-1;i>=0;i--){
while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
s.pop();
}
if(s.isEmpty()){
  nextGreater[i]=-1;
}else{
  nextGreater[i]=arr[s.peek()];
}
s.push(i);
}

// next greater right 
// next greater left
// next smaller right 
// next smaller left 
}
public static boolean isValid(String str){
  Stack<Character> s=new Stack<>();
  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if(ch=='(' || ch=='{' || ch=='['){
      s.push(ch);
    }
    else{
      if(s.isEmpty()){
        return false;
      }
    
      if ((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}')|| (s.peek()=='[' && ch==']')){
        s.pop();
      }
      else{
        return false;
      }
    }
  }
  if(s.isEmpty()) return true;
  else return false;

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
      // reverseStack(s);
      // printStack(s);

      /*
      int stock[]={100,80,60,70,60,85,100};
      int span[]=new int[stock.length];
      spanStock(stock,span);
      for(int i=0;i<span.length;i++){
        System.out.print(span[i]+" ");
      }
     */

    /* 
    int arr[]={6,8,0,1,3};
    int nextGreater[]=new int[arr.length];
    nextGreater(arr,nextGreater);
    for(int i=0;i<nextGreater.length;i++){
      System.out.print(nextGreater[i]+" ");
    }
 */ 
String str="({})[]";

System.out.println(isValid(str));

  }
}
