import java.util.*;
class Task5{
    public static void main(String[] args){
        LinkedList<Integer> al=new LinkedList<>();
         al.add(20);
        al.add(40);
        al.add(50);
        al.add(89);
        al.add(67);
        System.out.println(al);
        long start=System.nanoTime();
        al.add(3,45);
        al.remove(Integer.valueOf(50));
        long end=System.nanoTime();
        System.out.println("Time(ns) for ArrayList : "+(end-start));

        LinkedList<Integer> li=new LinkedList<>();
         li.add(20);
        li.add(40);
        li.add(50);
        li.add(89);
        li.add(67);
        System.out.println(li);
        long start1=System.nanoTime();
        li.add(3,45);
        li.remove(Integer.valueOf(50));
        long end1=System.nanoTime();
        System.out.println("Time(ns) for LinkedList : "+(end1-start1));
       
    }
}