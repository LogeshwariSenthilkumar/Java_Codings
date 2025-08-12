import java.util.*;
class ArrayList6{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        // System.out.println(al);
        al.add(2,80);
        // System.out.println(al);
        ArrayList<Integer> al2=new ArrayList<>();
        al2.ensureCapacity(20);
        System.out.println(al2.size());
        al2.addAll(al);
        al2.add(70);
        al2.add(100);
        al2.addAll(3,al);
         al2.add(100);
          al2.add(100);
           al2.add(100);
            al2.add(100);
             al2.add(100);
              al2.add(100);
               al2.add(100);
        System.out.println(al2);
        al2.ensureCapacity(20);
        System.out.println(al2.size());

    }
}