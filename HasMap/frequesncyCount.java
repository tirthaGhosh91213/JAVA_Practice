

import java.util.*;
public class frequesncyCount {
  public static void main(String[] args) {
      String str="aabbccdddd";
      HashMap<Character ,Integer> map=new HashMap<>();
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
/* 
        if(map.containsKey(ch)){
          map.put(ch, map.get(ch)+1);
        }
        else{
          map.put(ch, 1);
        }

 */

        // shortcut   
        map.put(ch, map.getOrDefault(ch, 0)+1);
       
      }
       System.out.println(map);
  }

}
