import java.util.HashMap;
import java.util.Map;

public class beautyOfSubstring {
   public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                Map<Character , Integer> map=new HashMap<>();
                for(int k=i;k<=j;k++){
                    map.put(s.charAt(k),map.getOrDefault(s.charAt(k),0)+1);
                }
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int f:map.values()){
                    max=Math.max(max,f);
                    min=Math.min(min,f);
                }
                ans+=(max-min);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
      
    }
}
