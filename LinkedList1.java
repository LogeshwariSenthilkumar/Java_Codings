import java.util.*;
class LL1{
    public static void main(String[] args){
        //Generic:
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
         
        //Non-Generic: 
        LinkedList ll2=new LinkedList();
        ll2.add(30);
        ll2.add("Logu");
        ll2.add("Dhivya");
        ll2.add(89);
        System.out.println(ll2);
    }
}