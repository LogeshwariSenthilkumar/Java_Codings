class Employee{
    void work(){
        System.out.println("Working...");
    }
}
class Developer extends Employee{
    void writeCode(){
         System.out.println("Writing Code...");
    }
}
class Tester extends Employee{
    void testCode(){
         System.out.println("Testing Code...");
    }
}
class Demo{
    public static void main(String[] args){
        Developer ob1=new Developer();
         System.out.println("Developer Class:");
        ob1.work();
        ob1.writeCode();
        Tester ob2=new Tester();
         System.out.println("\nTester Class:");
        ob2.work();
        ob2.testCode();
    }
}
