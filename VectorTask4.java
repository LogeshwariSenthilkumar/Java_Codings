import java.util.*;
class Task4{
    public static void main(String[] args){
        Vector<String> v=new Vector<>();
        v.add("Logu");
        v.add("Janu");
        v.add("Dhivya");
        v.add("Barani");
        v.add("Aishu");
        System.out.println(v);

        List<String> li=Collections.synchronizedList(v);
        synchronized(li){
            Iterator<String> it=li.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}