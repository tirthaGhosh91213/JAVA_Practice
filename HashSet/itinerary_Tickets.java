
import java.util.HashMap;

public class itinerary_Tickets {
  public static void travel(HashMap<String,String> tickets){
    HashMap<String ,String> map=new HashMap<>();
    for(String val:tickets.keySet()){
      map.put(tickets.get(val), val);
    }
    for(String key:tickets.keySet()){
      if(!map.containsKey(key)){
      
        System.out.print(key);
        for(String start:tickets.keySet()){
          System.out.print("---> "+tickets.get(start));
        }
      }
    }
  }

  public static void main(String[] args) {
     HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bangalore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        travel(tickets);
  }
}
