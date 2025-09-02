import java.util.*;
class Demo7{
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Mango");
        map.put(40, "Orange");

        System.out.println("TreeMap: " + map);

        //descendingKeySet();
        System.out.println(map.descendingKeySet());

        //descendingMap();
        // System.out.println(map.descendingMap());

        //headMap();
        System.out.println(map.headMap(30));
        System.out.println(map.headMap(30,true));

        //tailMap();
        System.out.println(map.tailMap(30,false));

        //subMap();
        System.out.println(map.subMap(20,40));
        System.out.println(map.subMap(20,true,40,true));
        System.out.println(map.subMap(20,false,40,true));

    }
}