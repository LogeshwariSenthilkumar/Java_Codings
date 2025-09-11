import java.util.function.BiFunction;
import java.util.function.Supplier;

//EmployeeFactory:
class Employee{
    String name;
    Double salary;
    public Employee(String name,Double salary){
        this.name=name;
        this.salary=salary;
    }
}
class Cons{
    public static void main(String[] args) {
        BiFunction<String,Double,Employee> fac=Employee::new;
        System.out.println(fac.apply("Logu",30000.0).name);
    }
}