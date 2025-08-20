import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(50);
        al.add(90);
        al.add(100);
        al.add(80);  
        
        ListIterator<Integer> li=al.listIterator();
        System.out.println("Forward : ");
        while(li.hasNext()){
           System.out.println(li.next());
        }
        System.out.println("Backward : ");
        while(li.hasPrevious()){
             System.out.println(li.previous());
        }
      System.out.println(al);
    }
}