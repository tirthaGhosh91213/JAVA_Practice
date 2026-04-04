public class Apnacollege {
  public static void changeArray(int arr[],int i,int val){
    if(i==arr.length){
      printArr(arr);
      return;
    }
    arr[i]=val;
    changeArray(arr, i+1, val+1);
    arr[i]=arr[i]-2; //backtracking step 
  }


  public static void printArr(int arr[]){
    for(int i=0; i<arr.length ; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void subSets0FString(String str,String res, int i){
    if(i==str.length()){
      if(res.length()==0){
        System.out.println("Null");
        return;
      }
      System.out.println(res);
      return;
    }
    subSets0FString(str, res+str.charAt(i), i+1);
    subSets0FString(str, res, i+1);

  }

  public static void permutation(String str, String res){
    if(str.length()==0){
      System.out.println(res);
      return;
    }
    for(int i=0;i<str.length();i++){
      char curr=str.charAt(i);
      String newStr=str.substring(0,i)+str.substring(i+1);
      permutation(newStr, res+curr);
    }
  }

  public static void main(String[] args) {
    int arr[]=new int [5];
    String str="abc";
     printArr(arr);
    // changeArray(arr, 0, 1);
    // subSets0FString(str, "", 0);
    permutation(str, "");
   
  }
}
