import java.util.*;
class ArrayList3{
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
        System.out.println(al2.get(0));
        System.out.println(al2.indexOf(20));
        System.out.println(al2.lastIndexOf(20));
        System.out.println(al2.contains(20));
         System.out.println(al2.isEmpty());
         System.out.println(al2.size());

    }
}