import java.util.*;
class Demo2{
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(39);
        lhs.add(35);
        lhs.add(45);
        lhs.add(32);
        lhs.add(78);
        lhs.add(39);
        System.out.println(lhs);

        LinkedHashSet lsh1=new LinkedHashSet();
         lsh1.add(39);
        lsh1.add("Logu");
        lsh1.add('S');
        lsh1.add(32);
        lsh1.add(78);
        lsh1.add(39);
        System.out.println(lsh1);
    }
}