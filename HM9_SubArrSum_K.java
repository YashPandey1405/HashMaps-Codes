import java.util.*;

public class HM9_SubArrSum_K {
    public static void main(String args[]) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = 10;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) { // O(n)....
            sum += arr[i];
            if (hm.containsKey(sum - k)) {
                ans += hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        System.out.println("THE COUNT IS ::: " + ans);
    }
}
