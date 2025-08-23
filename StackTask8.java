import java.util.*;
class Employee{
    int emp_id;
    String emp_name;
    int salary;
    Employee(int emp_id,String emp_name,int salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.salary=salary;
    }
}
class Task8{
    public static void main(String[] args){
        Stack<Employee> stk=new Stack<>();
        stk.push(new Employee(101,"Logu",60000));
        stk.push(new Employee(102,"Janu",40000));
        stk.push(new Employee(103,"Dhivya",70000));
        stk.push(new Employee(104,"Barani",50000));
        for(Employee e:stk){
            if(e.salary>50000){
                System.out.println(e.emp_id+" "+e.emp_name+" "+e.salary);
            }
           
        }
    }
}