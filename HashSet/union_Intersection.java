
import java.util.HashSet;

public class union_Intersection {
  public static void union(int arr[],int arr2[]){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
      set.add(arr[i]);
    }
    for(int i=0;i<arr2.length;i++){
      set.add(arr2[i]);
    }
    for(int num:set){
      System.out.print(num+" ");
     
    }
     System.out.println();
  }
  public static void intersection(int arr1[],int arr2[]){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
      set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
      if(set.contains(arr2[i])){
        System.out.print(arr2[i]+" ");
        set.remove(arr2[i]);
      }
    }
  }
  public static void main(String[] args) {
    int arr1[]={3,7,9,3,6};
    int arr2[]={4,7,3,0,7,6};
    union(arr1, arr2);
    intersection(arr1, arr2);
  }
}
