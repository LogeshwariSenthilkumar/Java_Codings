import java.util.*;
class ToDo{
    public static void main(String[] args){
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Revise one Java concept");
        pq.add("Practice 2 coding problems");
        pq.add("Update portfolio with one achievement/project");
        pq.add("Do one art/craft activity");
        pq.add("Help with one household task");
        System.out.println(pq.poll()+" --COMPLETED");   
        System.out.println(pq.poll()+" --COMPLETED");  
        System.out.println(pq.poll()+" --COMPLETED");  
        System.out.println(pq.poll()+" --COMPLETED");       
        System.out.println(pq.poll()+" --COMPLETED");  


    }
}