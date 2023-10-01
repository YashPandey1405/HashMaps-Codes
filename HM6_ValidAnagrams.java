import java.util.*;

public class HM6_ValidAnagrams {
    public static boolean ValidAnagrams(String str1, String str2) { // O(n)....
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) { // Loop To Traverse Str1.....
            char ch = str1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            // Above Statement Will Work The Same As The If-Else Ladder.....
        }
        for (int i = 0; i < str2.length(); i++) { // Loop To Traverse Str2.....
            char ch = str2.charAt(i);
            if (hm.get(ch) != null) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE FIRST STRING ::: ");
        String str1 = sc.next();
        System.out.print("ENTER THE SECOND STRING ::: ");
        String str2 = sc.next();
        // String str1 = "race";
        // String str2 = "care";
        boolean ans = ValidAnagrams(str1, str2);
        if (ans) {
            System.out.println("STRING '" + str1 + "'' AND '" + str2 + "' ARE VALID ANAGRAMS");
        } else {
            System.out.println("STRING '" + str1 + "'' AND '" + str2 + "' ARE NOT VALID ANAGRAMS");
        }
    }
}
