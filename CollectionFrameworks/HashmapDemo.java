package CollectionFrameworks;

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(101,"Mayur");
        map.put(102,"Rahul");
        map.put(103,"Jay");
        map.put(104,"Krish");

        System.out.println(map);
        System.out.println("Employee id 103 -> "+map.get(103));

        map.put(103, "Amit");
        System.out.println("New Employee id 103 -> "+map.get(103));
        map.remove(102);

        System.out.println(map);

    }
}
