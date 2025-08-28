import java.util.*;
class Printer{
    public static void main(String[] args){
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Collections.pdf");
        pq.add("JavaIntro.pdf");
        pq.add("JVM.pdf");
        pq.add("ControlStatements.pdf");
        pq.add("Abstraction.pdf");
        System.out.println(pq.poll()+" --PRINTED");   
        System.out.println(pq.poll()+" --PRINTED");  
        System.out.println(pq.poll()+" --PRINTED");  
        System.out.println(pq.poll()+" --PRINTED");       
        System.out.println(pq.poll()+" --PRINTED");  


    }
}