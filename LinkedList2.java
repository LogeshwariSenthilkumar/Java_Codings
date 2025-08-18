import java.util.*;
class LL2{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(100);
        ll.add(200);
        ll.add(80);
        ll.add(200);
        ll.addFirst(100);
        ll.addLast(200);
        ll.push(300);
        ll.offer(400);
        ll.offerFirst(500);
        ll.offerLast(600);
       

        ll.removeFirst();
        ll.removeLast();
        ll.removeFirstOccurrence(Integer.valueOf(100));
        ll.removeLastOccurrence(Integer.valueOf(200));
        ll.pop();
        System.out.println(ll);


        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println("Element : "+ll.element());
        System.out.println("Peek : "+ll.peek());
        System.out.println("Poll : "+ll.poll());
        System.out.println(ll);
        System.out.println("PF : "+ll.peekFirst());
        System.out.println("PL : "+ll.peekLast());
        System.out.println(ll);
        System.out.println("POF : "+ll.pollFirst());
        System.out.println(ll);
        System.out.println("POL : "+ll.pollLast());
        System.out.println(ll);

         
    }
}