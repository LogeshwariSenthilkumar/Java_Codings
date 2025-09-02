import java.util.*;
class Demo6{
    public static void main(String[] args){
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(102,"Logu");
        tm.put(101,"Janu");
        tm.put(100,"Chitra");
        tm.put(103,"Dhivya");
        tm.put(200,"Barani");

        System.out.println(tm);

        //firstKey();
        System.out.println(tm.firstKey());
        //lastKey();
        System.out.println(tm.lastKey());

        //higherKey()
        System.out.println(tm.higherKey(100));

        //lowerKey();
        System.out.println(tm.lowerKey(102));

        //ceilingKey();
        System.out.println(tm.ceilingKey(101));
        System.out.println(tm.floorKey(101));
    }
}