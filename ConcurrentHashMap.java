import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class Demo{
    public static void main(String[] args){
        ConcurrentHashMap<Integer,String> ll=new ConcurrentHashMap<>();
        ll.put(10,"Logu");
        ll.put(20,"Janu");
        ll.put(30,"Barani");
        ll.put(40,"Dhivya");
        ll.put(50,"Sanjay");
        System.out.println(ll);
        Iterator<Map.Entry<Integer,String>> li=ll.entrySet().iterator();
        while(li.hasNext()){
            Map.Entry<Integer,String> i=li.next();
            System.out.println(i.getKey()+" "+i.getValue());
            if(i.getKey()==20){
                ll.remove(i.getKey());
            }
        }
         System.out.println(ll);
    }
}