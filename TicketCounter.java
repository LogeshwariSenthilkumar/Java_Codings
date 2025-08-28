import java.util.*;
class Ticket{
    public static void main(String[] args){
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.add("Logeshwari");
        ad.add("Janani");
        ad.add("Barani");
        ad.add("Dhivya");
        ad.add("Hari");
        while(!ad.isEmpty())
        {
             System.out.println(ad.removeFirst() +" Ticket Served");
        }
        
    }
}