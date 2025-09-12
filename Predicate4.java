import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

//high Salary:
class Employee{
    int id;
    String name;
    int salary;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
}
class Predicate4 {
     public static void main(String[] args) {
         ArrayList<Employee> al=new ArrayList<>();
         al.add(new Employee(101,"Logu",60000));
         al.add(new Employee(102,"Janu",50000));
         al.add(new Employee(103,"Barani",40000));
         al.add(new Employee(104,"Chitra",70000));
         al.add(new Employee(105,"Shalini",35000));

         Predicate<Employee> highsalary=(emp)->(emp.salary>50000);
         for(Employee em:al){
             if(highsalary.test(em)){
                 System.out.println(em);
             }
         }

     }
}