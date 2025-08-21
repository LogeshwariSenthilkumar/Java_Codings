import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<String> empname= new ArrayList<>();
        empname.add("Logeshwari");
        empname.add("Dhivya");
        empname.add("Janani");
        empname.add("Barani");
        empname.add("Chitra");
        empname.add("Aishu");

        ListIterator<String> li=empname.listIterator();
        System.out.println("Employee Names : ");
        while(li.hasNext()){
            li.next();
        }
        while(li.hasPrevious()){
            System.out.println(li.previous().toUpperCase());
        }

    }
}