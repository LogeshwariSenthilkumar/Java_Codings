import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1{
    int id;
    String name;
    Employee1(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
}
class Samples{
    static int sorts(Employee1 s1,Employee1 s2){
        return s1.name.compareTo(s2.name);

    }
}
class MethodReference1 {
    public static void main(String[] args) {
        ArrayList<Employee1> al=new ArrayList<>();
        al.add(new Employee1(101,"Logu"));
        al.add(new Employee1(102,"Chitra"));
        al.add(new Employee1(103,"Janu"));
        al.add(new Employee1(104,"Barani"));
        Comparator<Employee1> c=Samples::sorts;
        Collections.sort(al,c);

        for(Employee1 emss:al){
            System.out.println(emss);
        }

    }

}
