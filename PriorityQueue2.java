import java.util.*;
class Priority2{
    public static void main(String[] args){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.offer(30);
        p.offer(15);
        p.offer(40);
        p.offer(20);
        p.offer(10);
        p.offer(65);
        p.offer(10);
        System.out.println(p);
    }
}