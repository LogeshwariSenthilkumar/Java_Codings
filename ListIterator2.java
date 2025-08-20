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
        while(li.hasNext()){
            Integer i=li.next();
            if(i==100){
                li.remove();
            }
            else if(i==80){
                li.add(200);
            }
            else if(i==50){
                li.set(60);
            }
        }
      System.out.println(al);
    }
}