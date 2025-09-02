import java.util.*;

class Demo6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Mango");
        map.put(40, "Orange");

        System.out.println("TreeMap: " + map);

        // ceilingKey examples
        System.out.println("ceilingKey(25): " + map.ceilingKey(25)); // >=25 → 30
        System.out.println("ceilingKey(20): " + map.ceilingKey(20)); // ==20 → 20
        System.out.println("ceilingKey(50): " + map.ceilingKey(50)); // no key >= 50 → null

        // floorKey examples
        System.out.println("floorKey(25): " + map.floorKey(25)); // <=25 → 20
        System.out.println("floorKey(20): " + map.floorKey(20)); // ==20 → 20
        System.out.println("floorKey(5): " + map.floorKey(5));   // no key <= 5 → null
    }
}
