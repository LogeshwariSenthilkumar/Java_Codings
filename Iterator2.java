import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add(20);
        al.add("Logu");
        al.add(90);
        al.add(100);
        al.add('S');  
        
        Iterator<Object> li=al.iterator();
        while(li.hasNext()){
            Object i=li.next();
            if(i instanceof Integer){
              if(i.equals(100)){
                li.remove();
            }
            }
            
        }
      System.out.println(al);
    }
}