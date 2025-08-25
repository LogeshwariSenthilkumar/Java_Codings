import java.util.*;
class Demo{
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);


        HashSet hs1=new HashSet();
        hs1.add(10);
        hs1.add("Logu");
        hs1.add('S');
        hs1.add(45);
        hs1.add(56);
        System.out.println(hs1);
    }
}