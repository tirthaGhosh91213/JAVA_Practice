

public class RotateString {
  public static boolean isRotated(String str1, String str2){
    if(str1.length()!=str2.length()) return false;
    String doubled =str1+str2;
    for(int i=0;i<=str1.length();i++){
      int j=0;
      while(j<str2.length() && doubled.charAt(i+j)==str2.charAt(j)){
        j++;
      }
      if(j==str2.length()) return true;
    }
    return false;
  }
  public static void main(String[] args) {
     String s1 = "ABCD";
        String s2 = "CDAB";

        if (isRotated(s1, s2)) {
            System.out.println("Same Sequence (Rotation)");
        } else {
            System.out.println("Not Same");
        }
  }
}
