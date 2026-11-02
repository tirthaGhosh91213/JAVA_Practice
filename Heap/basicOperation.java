
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
private  void heapify(int i){
  int left=i*2+1;
  int right=i*2+2;
  int minidx=i;
  if(list.size()>left && list.get(minidx)>list.get(left)){
    minidx=left;
  }
  if(list.size()>right && list.get(minidx)>list.get(right)){
    minidx=right;
  }
  if(minidx!=i){
    Collections.swap(list, i, minidx);
    heapify(minidx);
  }
}
public int remove(){
  int data=list.get(0);
  Collections.swap(list,0,list.size()-1);
  list.remove(list.size()-1);
  heapify(0);
  return data;
}
public boolean isEmpty(){
  return list.size()==0;
}
public void heapify2(int i,int size,int arr[]){
  int left=i*2+1;
  int right=i*2+2;
  int minidx=i;
  if(size>left && arr[minidx]<arr[left]){
    minidx=left;
  }
  if(size>right && arr[minidx]<arr[right]){
    minidx=right;
  }
  if(minidx!=i){
    int temp=arr[i];
    arr[i]=arr[minidx];
    arr[minidx]=temp;
    heapify2(minidx, size, arr);
  }
}
public void sortHeap(int arr[]){
  int n=arr.length;
  for(int i=n/2;i>=0;i--){
    heapify2(i,n,arr);
  }
  for(int i=n-1;i>0;i--){
    int temp=arr[0];
    arr[0]=arr[i];
    arr[i]=temp;
    heapify2(0,i,arr);
  }
}

}
  public static void main(String[] args) {
    int arr[]={1,2,4,5,3};
    
    Heap h = new Heap();

    h.Add(10);
    h.Add(20);
    h.Add(5);
    h.Add(30);
    h.Add(2);
  h.sortHeap(arr);

System.out.println("Sorted Array: " + Arrays.toString(arr));

    // System.out.println("Heap: " + h.list);
    // System.out.println("Minimum Element: " + h.peek());

    // while (!h.isEmpty()) {
    //     System.out.println("Removed: " + h.remove());
    // }

    // System.out.println("Heap Empty: " + h.isEmpty());
  }
}
