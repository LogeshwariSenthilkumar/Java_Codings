import java.util.*;
class Demo8{
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Mango");
        map.put(40, "Orange");
        


        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.higherEntry(20));
        System.out.println(map.lowerEntry(20));
        System.out.println(map.ceilingEntry(25));
        System.out.println(map.ceilingEntry(20));
        System.out.println(map.floorEntry(25));

        System.out.println(map);
        System.out.println(map.pollFirstEntry());
        System.out.println(map);
        System.out.println(map.pollLastEntry());
        System.out.println(map);

        

    }
}