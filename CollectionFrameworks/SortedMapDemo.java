package CollectionFrameworks;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(4, "A");
        map.put(2, "B");
        map.put(5, "C");
        map.put(1, "D");
        System.out.println(map);

    }
}
