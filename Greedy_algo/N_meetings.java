
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_meetings {
  public static List<int[]> n_meeting(int[] start,int[] end){
    int n=start.length;
    int meetings[][]=new int[n][3];
    for(int i=0;i<n;i++){
      meetings[i][0]=start[i];
      meetings[i][1]=end[i];
      meetings[i][2]=i;
    }
    Arrays.sort(meetings,(a,b)->a[1]-b[1]);
    List<int[]> ans=new ArrayList<>();
    int endTime=-1;
    for(int i=0;i<n;i++){
      if(meetings[i][0]>endTime){
        ans.add(new int[]{meetings[i][0],meetings[i][1],meetings[i][2]});
        endTime=meetings[i][1];
      }
    }
    ans.sort((a,b)->a[2]-b[2]);
    return ans;
  }
  public static void main(String[] args) {
     int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        List<int[]> result = n_meeting(start, end);

        System.out.println("Selected meetings:");

        for (int[] meeting : result) {

            System.out.println(
                "Index: " + meeting[2] +
                "  Start: " + meeting[0] +
                "  End: " + meeting[1]
            );
        }

        System.out.println("Maximum meetings = " + result.size());
    }
  }
