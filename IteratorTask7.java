import java.util.*;
class Task7{
    public static void main(String[] args){
        LinkedList<Integer> li=new LinkedList<>();
         li.add(20);
        li.add(40);
        li.add(50);
        li.add(89);
        li.add(67);
        System.out.println(li);
        // for(Integer i:li){
        //     if(i==20){
        //         li.remove(i);
        //     }
        // }

        Iterator<Integer> list=li.iterator();
        while(list.hasNext()){
            Integer i=list.next();
            if(i==20){
                list.remove();
            }
        }
         System.out.println("LinkedList After Removal : "+li);
    }
}