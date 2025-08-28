//as a Queue:
import java.util.*;
class Demo1{
    public static void main(String[] args){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(30);
        ad.offer(15);
        ad.offer(40);
        ad.offer(20);
        ad.offer(10);
        ad.offer(65);
        System.out.println(ad);
    }
}