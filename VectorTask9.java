import java.util.*;
class Task9{
    public static void main(String[] args){
        Vector<String> v=new Vector<>();
        v.add("Logu");
        v.add("Janu");
        v.add("Dhivya");
        v.add("Barani");
        v.add("Aishu");
        System.out.println(v);
        ListIterator<String> li=v.listIterator();
        while(li.hasNext()){
            String s=li.next();
            System.out.println(s+"-done");
        }
    }
}