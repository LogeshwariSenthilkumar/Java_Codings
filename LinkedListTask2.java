import java.util.*;
class Task2{
    public static void main(String[] args){
        LinkedList<String> li=new LinkedList<>();
        li.add("Logu");
        li.add("Janu");
        li.add("Dhivya");
        li.add("Barani");
        li.add("Aishu");
        System.out.println(li);
        ListIterator<String> list=li.listIterator();
        while(list.hasNext()){
            list.next();
        }
        System.out.println("Reverse Order : ");
        while(list.hasPrevious()){
           System.out.println( list.previous());
        }
    }
}