import java.util.*;

public class HM5_MajorityElement {
    public static void main(String args[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 1, 5, 1 };
        int n = arr.length;
        int Limit = (n) / 3;
        for (int i = 0; i < n; i++) { // O(n)...
            boolean temp = hm.containsKey(arr[i]);
            if (temp) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
            // Below Statement Will Work The Same As The Above If-Else Ladder.....
            // hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println("ELEMENTS IN THE ARRAY WITH COUNT > " + Limit + " ARE ::: ");
        Set<Integer> KeySet = hm.keySet();
        for (Integer Key : KeySet) {
            if (hm.get(Key) > Limit) {
                System.out.print(Key + " WITH COUNT --> " + hm.get(Key));
            }
        }
        // Below For-Each Loop Will Work The Same As The Above For-Each Loop.....
        // for (Integer Key : hm.keySet()) {
        // if (hm.get(Key) > Limit) {
        // System.out.print(Key + " WITH COUNT --> " + hm.get(Key));
        // }
        // }
    }
}
