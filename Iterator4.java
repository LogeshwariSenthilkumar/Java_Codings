import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> rollNo= new ArrayList<>();
        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(3);
        rollNo.add(4);
        rollNo.add(5);
        rollNo.add(6);

        ListIterator<Integer> li=rollNo.listIterator();
        System.out.println("Even Roll No : ");
        while(li.hasNext()){
            Integer i=li.next();
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}