import java.util.LinkedList;

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
class UserObjInLinkedList {
    public static void main(String[] args) {
        LinkedList<Employee> al=new LinkedList<>();
        al.add(new Employee(103,"Logu"));
        al.add(new Employee(105,"Chitra"));
        al.add(new Employee(102,"Janu"));
        al.add(new Employee(101,"Barani"));
        al.add(new Employee(104,"Dhivya"));
        System.out.println(al);

    }
}


