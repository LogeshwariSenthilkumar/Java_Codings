abstract class Employee{
    abstract void calculateSalary();
    abstract void getWorkHours();
    abstract void getRole();
}
class FullTimeEmployee extends Employee{
    void calculateSalary(){
         System.out.println("Calculating Salary for FullTime Employee..");
    }
    void getWorkHours(){
         System.out.println("Getting Work Hours for FullTime Employee..");
    }
    void getRole(){
         System.out.println("Getting Role for FullTime Employee...");
    }

}
class PartTimeEmployee extends Employee{
    void calculateSalary(){
         System.out.println("Calculating Salary for PartTime Employee..");
    }
    void getWorkHours(){
         System.out.println("Getting Working Hours PartTime Employee..");
    }
    void getRole(){
         System.out.println("Getting Role for PartTime Employee...");
    }


}
class Freelancer extends Employee{
     void calculateSalary(){
         System.out.println("Calculating Salary for Freelancer..");
    }
    void getWorkHours(){
         System.out.println("Getting Working Hours for Freelancer..");
    }
    void getRole(){
         System.out.println("Getting Role for Freelancer...");
    }



}
class Demo{
    public static void main(String[] args){

     FullTimeEmployee f=new FullTimeEmployee();
      System.out.println("FullTimeEmployee Class:");
      f.calculateSalary();
      f.getWorkHours();
      f.getRole();
     PartTimeEmployee p=new PartTimeEmployee();
     System.out.println("\nPartTimeEmployee Class:");
     p.calculateSalary();
     p.getWorkHours();
    p.getRole();
    Freelancer fc=new Freelancer();
     System.out.println("\nFreelancer Class:");
     fc.calculateSalary();
     fc.getWorkHours();
    fc.getRole();
    



    }
}