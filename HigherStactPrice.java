import java.util.*;
class HighestPrice{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>( Collections.reverseOrder());
        pq.add(80000);
        pq.add(10000);
        pq.add(90000);
        pq.add(40000);
        pq.add(15000);
        pq.add(35000);
      System.out.println(pq.poll());


    }
}