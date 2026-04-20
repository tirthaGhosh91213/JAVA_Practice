

import java.util.Stack;

class StackSpanProblem {
  public static void main(String[] args) {
    int arr[]={100,60,80,90,70,10};
    Stack<Integer> stack=new Stack<>();
    int result[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
      while(!stack.isEmpty()&& arr[stack.peek()]<=arr[i]){
        stack.pop();
      }
      result[i]=stack.isEmpty()?i+1:i-stack.peek();
      stack.push(i);
    }
    for(int num:result){
      System.out.println(num);
    }
  }
}
