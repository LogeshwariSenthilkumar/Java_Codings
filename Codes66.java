import java.util.*;
class ArrayList2{
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
        al2.addAll(al);
        al2.add(70);
        al2.add(100);
        al2.addAll(3,al);
        System.out.println(al2);
        // al.clear();
        // System.out.println(al);
        // al2.remove(0);
        // System.out.println(al2);
        // al2.removeAll(al);
        //  System.out.println(al2);
        // al2.remove(Integer.valueOf(100));
        //  System.out.println(al2);
        //  al2.retainAll(al);
        //   System.out.println(al2);
        al2.removeIf(n->n<100);
         System.out.println(al2);

    }
}