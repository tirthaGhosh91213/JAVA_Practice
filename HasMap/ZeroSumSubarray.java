
import java.util.HashSet;

public class ZeroSumSubarray {
  public static void main(String[] args) {
    int arr[]={4,2,-3,1,6};
    int sum=0;
    boolean found =false;
    HashSet<Integer> map=new HashSet<>();
    for(int i=0;i<arr.length;i++){
      int num=arr[i];
      sum+=num;
      if(sum==0||map.contains(sum)){
        found=true;
        break;
      }
      map.add(sum);

    }
    System.out.println(found?"Present":"Not Present");

  }
}
