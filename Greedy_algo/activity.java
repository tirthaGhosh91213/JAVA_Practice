
import java.util.*;
public class activity {
  public static void activity(int[] start,int[] end){
    int activity[][]=new int[start.length][3];
   for(int i=0;i<start.length;i++){
    activity[i][0]=i;
    activity[i][1]=start[i];
    activity[i][2]=end[i];
   }
   Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
   
  int maxCount=0;
  ArrayList<Integer> ans=new ArrayList<>();
  maxCount=1;
  ans.add(activity[0][0]);
  int LastEnd=activity[0][2];
  for(int i=1;i<end.length;i++){
    if(activity[i][1]>=LastEnd){
      maxCount++;
      ans.add(activity[i][0]);
      LastEnd=activity[i][2];
    }
  }
  System.out.println(maxCount);
  }
  public static void main(String[] args) {
    int arr1[]={1,2,0,3,6};
    int arr2[]={2,3,1,5,7};
    activity(arr1, arr2);
  }
}
