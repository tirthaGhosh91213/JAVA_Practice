

import java.util.HashMap;

public class SumSubArrByValue {
  
  public static void main(String[] args) {
      int arr[]={1,2,3};
      int k=3;
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      int sum=0;
      int count=0;
      for(int i=0;i<arr.length;i++){
        int num=arr[i];
        sum+=num;
        
        if(map.containsKey(sum-k)){
          count+=map.get(sum-k);
        }
        // map.put(sum, map.getOrDefault(sum, 0)+1);
        if(map.containsKey(sum)){
          map.put(sum, map.get(sum)+1);
        }
        else{
          map.put(sum, 1);
        }
      }
      System.out.println(count);

  }
}
