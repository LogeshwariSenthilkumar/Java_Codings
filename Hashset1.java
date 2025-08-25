import java.util.*;
class Demo1{
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(10);
        System.out.println(hs);
    //    for(Integer i:hs){
    //     System.out.print(i+" ");
    //    }


    Iterator<Integer> li=hs.iterator();
    while(li.hasNext()){
        System.out.println(li.next());
    }

        // hs.remove(20);
        // hs.removeIf(s->s>20);
    //    System.out.println(hs.isEmpty());
    //    System.out.println(hs.contains(20));
    //    System.out.println(hs.size());
    //      System.out.println(hs);
        
        
         HashSet<Integer> hs1=(HashSet)hs.clone();
         System.out.println(hs1);
    }
}