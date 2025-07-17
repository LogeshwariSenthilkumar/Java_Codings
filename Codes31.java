interface Comparator{
    void compare(Employee emp1,Employee emp2);
}
class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

}
class Main{
    public static void main(String[] args){
        Employee emp1=new Employee("Logu",520000);
        Employee emp2=new Employee("Dhivya",450000);
        Comparator c=new Comparator(){
            public void compare(Employee emp1,Employee emp2){
                if(emp1.salary>emp2.salary){
                    System.out.println("Employee 1 receives Higher Salary");
                }
                else{
                    System.out.println("Employee 2 receives Higher Salary");
                }
            }
        };
        c.compare(emp1,emp2);
    }
}