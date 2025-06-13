class Employee{
    private String name;
    private int id;
    private int salary;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}
class EmployeeSalaryPrivacy{
    public static void main(String[] args){
        Employee e1=new Employee("Logu",12,40000);
        Employee e2=new Employee("Janani",13,30000);
        Employee e3=new Employee("Hr",23,60000);
        System.out.println("Employee1:");
        System.out.println("Name:"+e1.getName()+" "+"Id:"+e1.getId()+" "+"Salary:"+e1.getSalary());
         System.out.println("Employee2:");
        System.out.println("Name:"+e2.getName()+" "+"Id:"+e2.getId()+" "+"Salary:"+e2.getSalary());
        if(e1.getName().equals("Hr") || e2.getName().equals("Hr") || e3.getName().equals("Hr")){
            e1.setSalary(50000);
            e2.setSalary(40000);
             System.out.println("AfterSalary Increment Employee1 Got Salary:"+e1.getSalary());
         System.out.println("AfterSalary Increment Employee2 Got Salary:"+e2.getSalary());
        }
       


    }

} 