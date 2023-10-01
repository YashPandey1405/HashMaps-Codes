import java.util.*;

public class HM3_LinkedHashMap {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); // Create Method.....
        // LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();

        // Insert-->O(1).....
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);
        lhm.put("UK", 70);
        // System.out.println("Insert --> THE LINKED HASHMAP IS ::: " + lhm);

        // // Get-->O(1)......
        // System.out.println();
        // System.out.println("Get --> THE VALUE OF KEY 'China' IS ::: " +
        // lhm.get("China"));
        // System.out.println("Get --> THE VALUE OF KEY 'India' IS ::: " +
        // lhm.get("India"));
        // System.out.println("Get --> THE VALUE OF KEY 'UK' IS ::: " + lhm.get("UK"));
        // System.out.println("Get --> THE VALUE OF KEY 'USA' IS ::: " +
        // lhm.get("USA"));
        // // Null Value When Key Is Not Present In The Linked HashMap......

        // // ContainsKey-->O(1).....
        // System.out.println();
        // System.out.println("ContainsKey --> 'India' PRESENT IN THE LINKED HASHMAP :::
        // " + lhm.containsKey("India"));
        // System.out.println("ContainsKey --> 'UAE' PRESENT IN THE LINKED HASHMAP ::: "
        // + lhm.containsKey("UAE"));

        // // Remove-->O(1).....
        // System.out.println();
        // System.out.println("Remove --> USA ::: " + lhm.remove("USA"));
        // System.out.println("Remove --> Pakistan ::: " + lhm.remove("Pakistan"));
        // System.out.println();

        // // Size-->O(1).....
        // System.out.println("THE SIZE OF LINKED HASHMAP IS ::: " + lhm.size());

        // // IsEmpty-->O(1).....
        // lhm.clear(); // To Make Our Linked Hashmap Empty.....
        // System.out.println("LINKED-HASHMAP IS EMPTY ::: " + lhm.isEmpty());

        // // Iterate On Linked HashMap-->O(1).....
        // Set<String> Keys = lhm.keySet();
        // System.out.println("THE SET OF KEYS OF LINKED HASHMAP IS ::: " + Keys);
        // for (String k : Keys) { // ForEach Loop On HashMap....
        // System.out.println("KEY :::" + k + " HAS VALUE ::: " + lhm.get(k));
        // }
    }
}