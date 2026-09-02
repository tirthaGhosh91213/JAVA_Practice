
public class odd_even {
  public static void odd_Even(int n){
    int bitMask=1;
    if((n & bitMask)==0){
      System.out.println("Number is even");
    }else {
      System.out.println("Number is Odd");
    }
  }
  public static int getithBit(int n,int i){
    int bitMask=1<<i;
    if((n& bitMask)==0){
      return 0;
    }
    return 1;
  }
  public static int setithBit(int n,int i){
    return (n | (1<<i));
  }
  public static int clearithBit(int n,int i){
    int bitMask= ~(1<<i);
    return n & bitMask;
  }
  public static int updateithBit(int n,int i,int newBit){
    // if(newBit==0){
    //  return clearithBit(n, i);
    // }else return setithBit(n, i);
    n=clearithBit(n, i);
    int bitMask=newBit<<i;
    return n | bitMask;
  }
  public static int clearIbit(int n,int i){
    int bitMask=(~0)<<i;
    return n & bitMask;
  }
  public static int clearRangeBit(int n,int i,int j){
    int a=(~0)<<(j+1);
    int b=(1<<i)-1;
    int temp=a|b;
    return n&temp;
  }
  public static void main(String[] args) {
    // odd_Even(3);
    // System.out.println("The i th Bit = "+getithBit(10, 3));
    // System.out.println(setithBit(10, 2));
    // System.out.println(clearithBit(10, 1));
    // System.out.println(updateithBit(10, 2, 1));
    // System.out.println(clearIbit(10, 2));
    System.out.println(clearRangeBit(15, 2, 5));
  }
}
