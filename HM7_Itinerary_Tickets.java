import java.util.*;

public class HM7_Itinerary_Tickets {
    public static String GetStart(HashMap<String, String> Tickets) { // O(n)....
        HashMap<String, String> RevMap = new HashMap<>();
        for (String Key : Tickets.keySet()) {
            RevMap.put(Tickets.get(Key), Key);
        }
        for (String Key : Tickets.keySet()) {
            if (RevMap.containsKey(Key) != true) {
                return Key;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bangalore");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");
        String StartKey = GetStart(hm);
        System.out.print("THE ITINERARY IS ::: " + StartKey);
        for (int i = 0; i < hm.size(); i++) {
            System.out.print(" --> " + hm.get(StartKey));
            StartKey = hm.get(StartKey);
        }
    }
}