import java.util.*;
class Employee{
    public static void main(String[] args){
        TreeMap<Integer,String> emp=new TreeMap<>();
        emp.put(103,"Logu");
        emp.put(101,"Chitra");
        emp.put(105,"Sanjay");
        emp.put(104,"Dhivya");
        emp.put(102,"Senthil");
        for(Map.Entry<Integer,String> map:emp.entrySet()){
            System.out.println(map.getValue());
        }

    }
}