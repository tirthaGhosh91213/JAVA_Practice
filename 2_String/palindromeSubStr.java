public class palindromeSubStr {
   public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub) && sub.length()>ans.length()){
                    ans=sub;
                }
            }
        }
        return ans;
    }
    public static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }




    // optimal TC=O(n);
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int freq[] =new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                    max=Math.max(max,freq[k]);
                    min=Math.min(min,freq[k]);
                    }
                }
                ans+=(max-min);
            }
        }
             return ans;
        }
       



    public static void main(String[] args) {
      
    }
}
