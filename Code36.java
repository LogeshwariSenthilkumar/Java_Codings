import java.util.*;
class Demo5{
    public static void main(String[] args){
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(30,"Apple");
        tm.put(20,"Orange");
        tm.put(50,"Cherry");
        tm.put(10,"Mango");
        tm.put(40,"Banana");
       
        System.out.println(tm);

        // System.out.println(tm.first());
        // System.out.println(tm.lastKey());
        // System.out.println(tm.higherKey(30));
        // System.out.println(tm.lowerKey(30));
        // System.out.println(tm.ceilingKey(35));
        // System.out.println(tm.ceilingKey(30));
        // System.out.println(tm.floorKey(35));
        // System.out.println(tm.floorKey(30));

        // System.out.println(tm.firstEntry());
        // System.out.println(tm.lastEntry());
        // System.out.println(tm.ceilingEntry(35));
        // System.out.println(tm.ceilingEntry(30));
        // System.out.println(tm.floorEntry(35));
        // System.out.println(tm.floorEntry(30));
        // System.out.println(tm.pollFirstEntry());
        // System.out.println(tm.pollLastEntry());

        // System.out.println(tm.descendingKeySet());
        // System.out.println(tm.descendingMap());

        // System.out.println(tm.headMap(30));
        // System.out.println(tm.headMap(30,true));
        // System.out.println(tm.tailMap(30));
        // System.out.println(tm.tailMap(30,false));
        // System.out.println(tm.subMap(20,40));
        // System.out.println(tm.subMap(20,true,40,true));

        NavigableSet<Integer> key=tm.navigableKeySet();
        for(Integer keys:key){
            System.out.println(keys+" "+tm.get(keys));
        }
    }
}