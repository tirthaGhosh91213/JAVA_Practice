
import java.util.Arrays;

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
  public static void main(String[] args) {
      int[][] cars = {
            {3, 3},
            {5, -1},
            {-2, 4}
        };

        int k = 2;

        nearByCar(cars, k);
  }
}
