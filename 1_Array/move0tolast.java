public class move0tolast {
  public static void move(int arr[]){
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
      }
    }
  }
  public static void main(String[] args) {
    int arr[]={1,0,3,5,0,4};
    move(arr);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
