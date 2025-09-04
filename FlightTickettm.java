import java.util.*;
class Ticket{
    public static void main(String[] args){
        TreeMap<String,Integer> ticket=new TreeMap<>();
        ticket.put("Mumbai",6500);
        ticket.put("Chennai",5700);
        ticket.put("Bengaluru",8900);
        ticket.put("Delhi",6000);
        ticket.put("Hyderabad",9900);
        for(Map.Entry<String,Integer> map:ticket.entrySet()){
            System.out.println(map.getKey()+" Rs."+map.getValue());
        }

    }
}