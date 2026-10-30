
import java.util.ArrayList;
public class basicOperation {
  static class Heap{
    ArrayList<Integer> list=new ArrayList<>();

 public void Add(int data) {
    list.add(data);
    int x = list.size() - 1;
    while (x > 0) {
        int par = (x - 1) / 2;
        if (list.get(x) < list.get(par)) {
            int temp = list.get(x);
            list.set(x, list.get(par));
            list.set(par, temp);
            x = par;
        } else {
            break;
        }
    }
}

public int peek(){
  return list.get(0);
}

}
  public static void main(String[] args) {
    
        Heap h = new Heap();

        h.Add(10);
        h.Add(20);
        h.Add(5);
        h.Add(30);
        h.Add(2);

        System.out.println("Heap: " + h.list);
        System.out.println("Minimum Element: " + h.peek());
  }
}
