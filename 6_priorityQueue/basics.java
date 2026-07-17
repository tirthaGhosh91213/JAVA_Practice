import java.util.Comparator;
import java.util.PriorityQueue;

public class basics {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    pq.add(1);
    pq.add(7);
    pq.add(6);
    pq.add(2);
    while(!pq.isEmpty()){
      System.out.print(pq.peek()+" ");
      pq.remove();
    }
  }
}
