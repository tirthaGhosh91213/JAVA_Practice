public class KTimeStringRotation {
  public static void stringRotation(String s,int k){
   
    while(k>0){
        StringBuilder ans=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='z'){
          ans.append("ab");
        }
        else {
          ans.append((char)(ch+1));
        }
      }
      k--;
      s=ans.toString();
    }
    System.out.println(s);
   
  }
  public static void main(String[] args) {
    String str="abc";
    int rotation =3;
    stringRotation(str, rotation);
  }
}
