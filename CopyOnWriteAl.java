import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
class Demo{
    public static void main(String[] args){
        CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        Iterator<Integer> li=al.iterator();
        while(li.hasNext()){
            Integer i=li.next();
            System.out.println(i);
            if(i==20){
                al.remove(i);
            }
        }
         System.out.println(al);
    }
}