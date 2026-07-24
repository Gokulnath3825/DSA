package LinkedList;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    public static void main(String[] args) {

        LRUCache obj = new LRUCache(2);

        obj.put(1, 1);
        obj.put(2, 2);

        System.out.println(obj.get(1)); // 1

        obj.put(3, 3); // removes key 2

        System.out.println(obj.get(2)); // -1

        obj.put(4, 4); // removes key 1

        System.out.println(obj.get(1)); // -1
        System.out.println(obj.get(3)); // 3
        System.out.println(obj.get(4)); // 4
    }
}