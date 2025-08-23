import java.util.*;
class Task1{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);

        Iterator<Integer> li=al.iterator();
        while(li.hasNext()){
            Integer i=li.next();
            if(i%2==0){
                li.remove();
            }
        }
        System.out.println(al);
    }
}