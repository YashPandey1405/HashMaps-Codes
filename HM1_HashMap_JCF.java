import java.util.*;

public class HM1_HashMap_JCF {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>(); // Create Method.....
        // HashMap<Integer, Integer> hm = new HashMap<>();

        // Insert-->O(1).....
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("UK", 70);
        // System.out.println("Insert --> THE HASHMAP IS ::: " + hm);

        // Get-->O(1)......
        // System.out.println();
        // System.out.println("Get --> THE VALUE OF KEY 'China' IS ::: " +
        // hm.get("China"));
        // System.out.println("Get --> THE VALUE OF KEY 'India' IS ::: " +
        // hm.get("India"));
        // System.out.println("Get --> THE VALUE OF KEY 'UK' IS ::: " + hm.get("UK"));
        // System.out.println("Get --> THE VALUE OF KEY 'USA' IS ::: " + hm.get("USA"));
        // Null Value When Key Is Not Present In The HashMap......

        // ContainsKey-->O(1).....
        // System.out.println();
        // System.out.println("ContainsKey --> 'India' PRESENT IN THE HASHMAP ::: " +
        // hm.containsKey("India"));
        // System.out.println("ContainsKey --> 'Pakistan' PRESENT IN THE HASHMAP ::: " +
        // hm.containsKey("Pakistan"));

        // Remove-->O(1).....
        // System.out.println();
        // System.out.println("Remove --> USA ::: " + hm.remove("USA"));
        // System.out.println("Remove --> Pakistan ::: " + hm.remove("Pakistan"));
        // System.out.println();

        // Size-->O(1).....
        // System.out.println("THE SIZE OF HASHMAP IS ::: " + hm.size());

        // IsEmpty-->O(1).....
        // hm.clear(); // To Make Our Hashmap Empty.....
        // System.out.println("HASHMAP IS EMPTY ::: " + hm.isEmpty());

        // Iterate On HashMap-->O(1).....
        Set<String> Keys = hm.keySet();
        System.out.println("THE SET OF KEYS OF HASHMAP IS ::: " + Keys);
        for (String k : Keys) { // ForEach Loop On HashMap....
            System.out.println("KEY :::" + k + " HAS VALUE ::: " + hm.get(k));
        }
    }
}
