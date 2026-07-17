
import java.util.Comparator;
import java.util.PriorityQueue;



public class pqObjectsCompareTo {
  static class Student Comparable<Student>{
    String name;
    int rank;
    public Student(String name,int rank){
      this.name=name;
      this.rank=rank;
    }
    @Override
    public int compareTo(Student s2){
      return this.rank-s2.rank;
    }

  }
   public static void main(String[] args) {
    PriorityQueue<String > pq=new PriorityQueue<>(Comparator.reverseOrder());
    pq.add();
    pq.add();
    pq.add();
    pq.add();
    while(!pq.isEmpty()){
      System.out.print(pq.peek()+" ");
      pq.remove();
    }
  }
}
