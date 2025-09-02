import java.util.*;
class Demo3{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(10,"Mango");
        lhm.put(20,"Orange");
        lhm.put(30,"Apple");
        lhm.put(40,"Banana");
        lhm.put(50,"Cherry");
        System.out.println(lhm);
    }
}