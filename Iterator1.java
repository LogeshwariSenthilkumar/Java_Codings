import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(50);
        al.add(90);
        al.add(100);
        al.add(80);  
        
        Iterator<Integer> li=al.iterator();
        while(li.hasNext()){
            Integer i=li.next();
            if(i==100){
                li.remove();
            }
        }
      System.out.println(al);
    }
}