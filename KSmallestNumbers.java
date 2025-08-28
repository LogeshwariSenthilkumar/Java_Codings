import java.util.*;
class KSmallest{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(80);
        pq.add(10);
        pq.add(90);
        pq.add(40);
        pq.add(15);
        pq.add(35);
        int k=3;
        for(int i=0;i<k;i++){
              System.out.println(pq.poll());
        }


    }
}