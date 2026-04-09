
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
  public static void mostwaterWithContainer(ArrayList<Integer> height){
    int max=0;
    for(int i=0;i<height.size();i++){
      for(int j=i+1;j<height.size();j++){
        int waterlevel=Math.min(height.get(i),height.get(j));
        int width=j-i;
        int water=waterlevel*width;
        if(water>max){
          max=water;
        }
      }
    }
    System.out.println("The maximum water level is :- "+max);
  }
  public static void mostWaterTwoPointer(ArrayList<Integer> height){
    int max=0;
    int lp=0,rp=height.size()-1;
    while(lp<rp){
      int ht=Math.min(height.get(lp),height.get(rp));
      int width=rp-lp;
      int water=ht*width;
      if(water>max){
        max=water;
      }
      if(height.get(lp)<height.get(rp)){
        lp++;
      }else rp--;
    }
    System.out.println("The maximum water store by the pointer is :- "+max);
  }

  public static boolean  prairSum(ArrayList<Integer> height, int target){
    for(int i=0;i<height.size();i++){
      for(int j=i+1;j<height.size();j++){
        if(height.get(i)+height.get(j)==target){
        return true;
         
        }
      }
    }
    return false;
  }
  public static boolean prairSumTwoPointer(ArrayList<Integer> list,int target){
    int lp=0,rp=list.size()-1;
    while(lp<rp){
      if((list.get(lp)+list.get(rp))==target){
        return true;
      }else if((list.get(lp)+list.get(rp))<target){
        lp++;
      }
      else{
        rp--;
      }
    }
    return false;
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

    // mostwaterWithContainer(list);
    // mostWaterTwoPointer(list);
    // System.out.println(prairSum(list, 10));
    System.out.println(prairSumTwoPointer(list, 100));
    // System.out.println(list);
  }
}
