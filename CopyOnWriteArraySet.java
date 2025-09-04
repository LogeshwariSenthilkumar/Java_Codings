import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
class Demo{
    public static void main(String[] args){
        CopyOnWriteArraySet<Integer> ll=new CopyOnWriteArraySet<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        Iterator<Integer> li=ll.iterator();
        while(li.hasNext()){
            Integer i=li.next();
            System.out.println(i);
            if(i==20){
                ll.remove(i);
            }
        }
         System.out.println(ll);
    }
}