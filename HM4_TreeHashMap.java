import java.util.*;

public class HM4_TreeHashMap {
    public static void main(String args[]) {
        TreeMap<String, Integer> thm = new TreeMap<>(); // Create Method.....
        // TreeMap<Integer, Integer> thm = new TreeMap<>();

        // Insert-->O(1).....
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("USA", 50);
        thm.put("UK", 70);
        // System.out.println("Insert --> THE TREE-HASHMAP IS ::: " + thm);

        // Get-->O(1)......
        // System.out.println();
        // System.out.println("Get --> THE VALUE OF KEY 'China' IS ::: " +
        // thm.get("China"));
        // System.out.println("Get --> THE VALUE OF KEY 'India' IS ::: " +
        // thm.get("India"));
        // System.out.println("Get --> THE VALUE OF KEY 'UK' IS ::: " + thm.get("UK"));
        // System.out.println("Get --> THE VALUE OF KEY 'USA' IS ::: " +
        // thm.get("USA"));
        // // Null Value When Key Is Not Present In The Tree-HashMap......

        // // ContainsKey-->O(1).....
        // System.out.println();
        // System.out.println("ContainsKey --> 'India' PRESENT IN THE TREE-HASHMAP ::: "
        // + thm.containsKey("India"));
        // System.out.println("ContainsKey --> 'UAE' PRESENT IN THE TREE-HASHMAP ::: " +
        // thm.containsKey("UAE"));

        // // Remove-->O(1).....
        // System.out.println();
        // System.out.println("Remove --> USA ::: " + thm.remove("USA"));
        // System.out.println("Remove --> Pakistan ::: " + thm.remove("Pakistan"));
        // System.out.println();

        // // Size-->O(1).....
        // System.out.println("THE SIZE OF TREE-HASHMAP IS ::: " + thm.size());

        // // IsEmpty-->O(1).....
        // thm.clear(); // To Make Our Tree-Hashmap Empty.....
        // System.out.println("TREE-HASHMAP IS EMPTY ::: " + thm.isEmpty());

        // Iterate On Tree-HashMap-->O(1).....
        // Set<String> Keys = thm.keySet();
        // System.out.println("THE SET OF KEYS OF TREE-HASHMAP IS ::: " + Keys);
        // for (String k : Keys) { // ForEach Loop On HashMap....
        // System.out.println("KEY :::" + k + " HAS VALUE ::: " + thm.get(k));
        // }
    }
}
