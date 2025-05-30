class Employee{
    String name="Logeshwari Senthilkumar";
    int salary=60000;   
}
class Manager extends Employee{
    String department="IT";
    void displayDetails(){
         System.out.println("Name:"+name);
         System.out.println("Salary:"+salary);
         System.out.println("Department:"+department);

    }
}
class Demo{
    public static void main(String[] args){
        Manager ob= new Manager();
        System.out.println("Manager Class:");
        ob.displayDetails();
    }
}
