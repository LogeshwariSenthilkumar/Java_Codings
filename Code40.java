import java.util.Stack;

class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}
class UserObjInStack {
    public static void main(String[] args) {
        Stack<Employee> al=new Stack<>();
        al.push(new Employee(103,"Logu"));
        al.push(new Employee(105,"Chitra"));
        al.push(new Employee(102,"Janu"));
        al.push(new Employee(101,"Barani"));
        al.push(new Employee(104,"Dhivya"));
        System.out.println(al);

    }
}


