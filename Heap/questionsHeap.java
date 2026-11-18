
import java.util.Arrays;
import java.util.PriorityQueue;

public class questionsHeap {
  public static void nearByCar(int car[][],int k){
    Arrays.sort(car,(a,b)->{
      int d1=a[0]*a[0]+a[1]*a[1];
      int d2=b[0]*b[0]+b[1]*b[1];
      return Integer.compare(d1, d2);
    });
    for(int i=0;i<k;i++){
      System.out.println(Arrays.toString(car[i]));
    }
  }
  public static void N_ropes(int ropes[]){
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int i=0;i<ropes.length;i++){
      pq.add(ropes[i]);
    }
    int cost=0;
    while(pq.size()>1){
      int min1=pq.remove();
      int min2=pq.remove();
      cost+=min1+min2;
      pq.add(min1+min2);
    }
    System.out.println(cost);
  }

  public static int[] kWeakestRow(int mat[][],int k){
    PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->{
      if(a[0]==b[0]) return Integer.compare(a[1], b[1]);
      return Integer.compare(a[0], b[0]);
    });
    for(int i=0;i<mat.length;i++){
      int soldiers=0;
      for(int j=0;j<mat[i].length;j++){
        if(mat[i][j]==1){
        soldiers++;
        }
      }
        pq.add(new int[]{soldiers,i});
    }
    int ans[]=new int[k];
    for(int i=0;i<k;i++){
      ans[i]=pq.remove()[1];
    }
    return ans;
  }
  public static void main(String[] args) {
      int[][] cars = {
            {3, 3},
            {5, -1},
            {-2, 4}
        };

        // int k = 2;

        // nearByCar(cars, k);
        int arr1[]={2,3,3,4,6};
        // N_ropes(arr1);


    int[][] mat = {
        {1, 1, 0, 0},
        {1, 1, 1, 0},
        {1, 0, 0, 0},
        {1, 1, 0, 0},
        {1, 1, 1, 1}
    };

    int k = 3;
    int[] ans = kWeakestRow(mat, k);
    System.out.println(Arrays.toString(ans));


  }
}
