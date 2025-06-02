class Employee{
    void getRole(){
        System.out.println("Starting...");
    }
}
class Manager extends Employee{
    void getRole(){
        System.out.println("Manager Role...");
    }
}
class Developer extends Employee{
    void getRole(){
        System.out.println("Developer Role...");
    }
}
class Intern extends Employee{
    void getRole(){
        System.out.println("Intern Role...");
    }
}
class Demo{
    public static void main(String[] args)
    {
        Manager m=new Manager();
        m.getRole();
        Developer d=new Developer();
        d.getRole();
        Intern i=new Intern();
        i.getRole();

    }
}