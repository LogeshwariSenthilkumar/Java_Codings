import java.util.Scanner;
class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
   void displayDetails(){
    System.out.println("Name:"+name+"\n"+"ID:"+id);
   }
   void updateInfo(String name,int id){
    this.name=name;
    this.id=id;
    System.out.println("Updated Successfully!!!");
   }
}
class Manager extends Employee{
    Manager(String name,int id){
        super(name,id);
    }
    void calculateSalary(){
         System.out.println("Salary is:"+(12*60000));
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         Manager m1=new Manager("Logu",101);
         for(int i=1;i<=3;i++){
            System.out.println("\nEnter What you want: \n1.CalculateSalary \n2.DisplayDetails \n3.UpdateInfo");
        int type=sc.nextInt();
        sc.nextLine();
        
        switch(type){
            case 1:
                 System.out.println();
                m1.calculateSalary();
                break;
            case 2:
                 System.out.println();
                m1.displayDetails();
                break;
            case 3:
                 System.out.println();
                System.out.println("Enter New Name:");
                String name1=sc.nextLine();
                System.out.println("Enter New Id:");
                int id1=sc.nextInt();
                m1.updateInfo(name1,id1);
                m1.displayDetails();
                break;
            default:
                System.out.println("InVaild!!!");

        }
         }
       
        
    }

}