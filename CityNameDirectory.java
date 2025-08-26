import java.util.*;
class CityNameDirectory{
    public static void main(String[] args){
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Chennai");
        ts.add("Coimbatore");
        ts.add("Madurai");
        ts.add("Tiruchirappalli");
        ts.add("Salem");
        ts.add("Vellore");
        System.out.println(ts);
        ts.add("Erode");
        System.out.println("Updated Sorted List :");
        System.out.println(ts);
    }
}