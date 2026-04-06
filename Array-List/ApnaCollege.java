
import java.util.ArrayList;
import java.util.Collections;

public class ApnaCollege {
  public static void printArrayList(ArrayList<Integer> list){
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
    System.out.println();
  }

  // Reverse a arrayList 
  public static void ReverseList(ArrayList<Integer> list){
    for(int i=list.size()-1;i>=0;i--){
      System.out.print(list.get(i)+" ");
    }
    System.out.println();
  }

  // Maximum value of an List
  public static void MaxValue(ArrayList<Integer> list){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
      if(list.get(i)>max){
        max=list.get(i);
      }
    }
    System.out.println(max);
  }

  public static void SwapValue(ArrayList<Integer> list, int idx1, int idx2){
    for(int i=0;i<list.size();i++){
      int temp=list.get(idx1);
      list.set(idx1, list.get(idx2));
      list.set(idx2,temp);
      
    }
    printArrayList(list);
  }
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(10);
    list.add(182);
    printArrayList(list);
    // ReverseList(list);
    // MaxValue(list);
    // SwapValue(list, 1, 4);
    Collections.sort(list);
    
    /* 
    Collections.sort(list,Collections.reverseOrder());
    printArrayList(list);
    */

    // System.out.println(list);
  }
}
