import java.util.*;

public class HM2_HashMap {
    static class HashMap<K, V> { // <K,V> --> Generic Datatype For Key & Value...
        private class Node {
            K Key;
            V Value;

            public Node(K Key, V Value) {
                this.Key = Key;
                this.Value = Value;
            }
        }

        private int n; // Count Of Total No Of Nodes In The Array..........
        private int N; // Count Of Total Elements In The Array.....
        private LinkedList<Node> Buckets[]; // Array Storing LinkedList Nodes.......

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.Buckets = new LinkedList[4]; // We Declared The Size Of Buckets Array Here....
            for (int i = 0; i < 4; i++) {
                // We Initialized The LinkedList At Each Index Of The Bucket Array Indexes....
                this.Buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunction(K Key) {
            int HashCode = Key.hashCode(); // Inbuilt Function In Java Collection Frameworks....
            return Math.abs(HashCode) % N;
        }

        private int SearchInLL(K Key, int bi) {
            LinkedList<Node> ll = Buckets[bi]; // ll will point LinkedList At Index Buckets[bi]....
            int DataIdx = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.Key == Key) {
                    return DataIdx;
                }
                DataIdx++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void ReHash() {
            LinkedList<Node> OldBuck[] = Buckets;
            Buckets = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < Buckets.length; i++) {
                Buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < OldBuck.length; i++) {
                LinkedList<Node> ll = OldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node OldNode = ll.remove();
                    Put(OldNode.Key, OldNode.Value);
                }
            }
        }

        public void Put(K Key, V Value) {
            int BucketIdx = HashFunction(Key);
            int DataIdx = SearchInLL(Key, BucketIdx);
            if (DataIdx != (-1)) { // When (Key,Value) Already Exist In The HashMap...
                Node NewNode = Buckets[BucketIdx].get(DataIdx);
                NewNode.Value = Value; // We Will Simply Update The Value.....
            } else { // When (Key,Value) Not Exist In The HashMap...
                Buckets[BucketIdx].add(new Node(Key, Value));
                n++;
            }
            double Lamda = (double) n / N;
            if (Lamda > 2.0) {
                ReHash();
            }
        }

        public boolean ContainsKey(K Key) {
            int BucketIdx = HashFunction(Key);
            int DataIdx = SearchInLL(Key, BucketIdx);
            if (DataIdx != (-1)) { // When (Key,Value) Already Exist In The HashMap...
                return true;
            } else { // When (Key,Value) Not Exist In The HashMap...
                return false;
            }
        }

        public V Remove(K Key) {
            int BucketIdx = HashFunction(Key);
            int DataIdx = SearchInLL(Key, BucketIdx);
            if (DataIdx != (-1)) { // When (Key,Value) Already Exist In The HashMap...
                Node NewNode = Buckets[BucketIdx].remove(DataIdx);
                n--;
                return NewNode.Value;
            } else { // When (Key,Value) Not Exist In The HashMap...
                return null;
            }
        }

        public V Get(K Key) {
            int BucketIdx = HashFunction(Key);
            int DataIdx = SearchInLL(Key, BucketIdx);
            if (DataIdx != (-1)) { // When (Key,Value) Already Exist In The HashMap...
                Node NewNode = Buckets[BucketIdx].get(DataIdx);
                return NewNode.Value;
            } else { // When (Key,Value) Not Exist In The HashMap...
                return null;
            }
        }

        public boolean IsEmpty() {
            return n == 0;
        }

        public ArrayList<K> KeySet() {
            ArrayList<K> Keys = new ArrayList<>();
            for (int i = 0; i < Buckets.length; i++) {
                LinkedList<Node> ll = Buckets[i];
                for (Node node : ll) {
                    Keys.add(node.Key);
                }
            }
            return Keys;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        // Put-->O(1)......
        hm.Put("India", 100);
        hm.Put("China", 150);
        hm.Put("USA", 50);
        hm.Put("UK", 70);

        System.out.print("THE KEY-SET OF THE HASHMAP IS ::: ");
        ArrayList<String> list = hm.KeySet();
        for (String key : list) {
            System.out.print(key + " ");
        }
        System.out.println();

        // Get-->O(1)......
        System.out.println();
        System.out.println("Get --> THE VALUE OF KEY 'China' IS ::: " + hm.Get("China"));
        System.out.println("Get --> THE VALUE OF KEY 'India' IS ::: " + hm.Get("India"));
        System.out.println("Get --> THE VALUE OF KEY 'UK' IS ::: " + hm.Get("UK"));
        System.out.println("Get --> THE VALUE OF KEY 'USA' IS ::: " + hm.Get("USA"));
        System.out.println("Get --> THE VALUE OF KEY 'Pakistan' IS ::: " + hm.Get("Pakistan"));
        // Null Value When Key Is Not Present In The HashMap......

        // ContainsKey-->O(1).....
        System.out.println();
        System.out.println("ContainsKey --> 'India' PRESENT IN THE HASHMAP ::: " + hm.ContainsKey("India"));
        System.out.println("ContainsKey --> 'Pakistan' PRESENT IN THE HASHMAP ::: " + hm.ContainsKey("Pakistan"));

        // Remove-->O(1).....
        System.out.println();
        System.out.println("Remove --> USA ::: " + hm.Remove("USA"));
        System.out.println("Remove --> Pakistan ::: " + hm.Remove("Pakistan"));
        // Null Value When Key Is Not Present In The HashMap......
        System.out.println();

        // IsEmpty-->O(1).....
        // hm.clear(); // To Make Our Hashmap Empty.....
        System.out.println("HASHMAP IS EMPTY ::: " + hm.IsEmpty());

    }
}
/*
 * The Worst Case Time Complexity In HashMap Is O(n) For All Opeartions And This
 * Happens When The Hash Function Returns Same Bucket Index For All Keys And Due
 * To This , All Nodes Will Get Attached To A Single Index In The Bucket Index
 * And All The Nodes Will Get Attached Linearly In A Single Bucket Index Which
 * Results In O(n) Time Complexity In Worst Case.....
 * Generally , The Time Complexity Of All The Hash Functions In HashMap Is O(1)
 * Except The Worst Case In HashMap Where The Time Complexity Reaches O(n).....
 * Thus , Time Complexity In Worst case In Hashmap Is O(n)........
 */
