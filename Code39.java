import java.util.Vector;

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
class UserObjInVector {
    public static void main(String[] args) {
        Vector<Employee> al=new Vector<>();
        al.addElement(new Employee(103,"Logu"));
        al.addElement(new Employee(105,"Dharshini"));
        al.addElement(new Employee(102,"Janu"));
        al.addElement(new Employee(101,"Barani"));
        al.addElement(new Employee(104,"Dhivya"));
        System.out.println(al);

    }
}


