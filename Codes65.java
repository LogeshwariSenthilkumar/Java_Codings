import java.util.*;
class ArrayList1{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.add(2,80);
        System.out.println(al);
        ArrayList<Integer> al2=new ArrayList<>();
        al2.addAll(al);
        al2.add(70);
        al2.add(100);
        al2.addAll(3,al);
        System.out.println(al2);

    }
}