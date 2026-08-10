public class palindromePair {
  public static boolean canformPalindrome(String s){
    int freq[]=new int[26];
    for(char c : s.toCharArray()){
      freq[c-'a']++;
    }
    int odd=0;
    for(int f : freq){
      if(f%2!=0) odd++;
    }
    return odd<=1;
  }
  public static int palindromePari(String arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        String combined =arr[i]+arr[j];
        if(canformPalindrome(combined)){
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
      String[] arr = {"ab", "ba", "abc", "cba"};

        System.out.println(palindromePari(arr));
  }
}
