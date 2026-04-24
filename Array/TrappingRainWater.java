public class TrappingRainWater {
  public static void main(String[] args) {
    int arr[]={4,2,0,6,3,2,5};
    int leftMax[]=new int[arr.length];
    leftMax[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      leftMax[i]=Math.max(leftMax[i-1], arr[i]);
    }
    int rightMax[]=new int[arr.length];
    rightMax[arr.length-1]=arr[arr.length-1];
    for(int j=arr.length-2;j>=0;j--){
      rightMax[j]=Math.max(rightMax[j+1], arr[j]);
    }
int trappedWater=0;
for(int i=0;i<arr.length;i++){
  int waterLevel=Math.min(rightMax[i], leftMax[i]);
  trappedWater+=(waterLevel-arr[i])*1;
}
System.out.println(trappedWater);

  }
}
