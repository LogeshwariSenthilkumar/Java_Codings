import java.util.*;
class HospitalEmergency{
    public static void main(String[] args){
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Logeshwari");
        pq.add("Janani");
        pq.add("Barani");
        pq.add("Hari");
        pq.add("Dhivya");
        pq.add("Aishu");
        System.out.println(pq.poll()+" --TREATED");   
        System.out.println(pq.poll()+" --TREATED");  
        System.out.println(pq.poll()+" --TREATED");  
        System.out.println(pq.poll()+" --TREATED");       
        System.out.println(pq.poll()+" --TREATED");  
        System.out.println(pq.poll()+" --TREATED");  
    }
}