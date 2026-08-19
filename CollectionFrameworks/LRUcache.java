package CollectionFrameworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUcache(int capacity){
        super(capacity , 0.75f , true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args){

        LinkedHashMap<String, Integer> linkedHashMap = new LRUcache<>(3);
        linkedHashMap.put("Ram",93);
        linkedHashMap.put("Shyam",91);
        linkedHashMap.put("Meet",78);
        linkedHashMap.put("Raghu",95);
        linkedHashMap.put("Meet",56);
        linkedHashMap.put("Ram",95);
        linkedHashMap.put("Meet",77);
        System.out.println(linkedHashMap);

    }
}
