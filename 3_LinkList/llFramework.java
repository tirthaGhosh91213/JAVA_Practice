
import java.util.LinkedList;

public class llFramework {

  public static void main(String[] args) {
    LinkedList<Integer> ll=new LinkedList<>();
    ll.add(1);
    ll.addFirst(2);
    ll.addLast(3);
    System.out.println(ll);
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);
  }
}
