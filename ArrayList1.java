import java.util.*;
class Collection1{
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add("Logu");
        al.add(55);
        al.add('s');
        System.out.println(al);     //Non-generic

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        System.out.println(al2);     //Generic

    }
}