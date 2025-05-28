class College{
    public void welcome(){
        System.out.println("Welcome to the college!!!");
    }
}
class Staff extends College{
    public void resnum(){
        System.out.println("Register number generated...");
    }
}
class Student extends Staff{
    public void student(){
        welcome();
        resnum();
        System.out.println("Student Added...");
    }
}
class Multilevel{
    public static void main(String[] args)
    {
        Student ob=new Student();
        ob.student();

    }
}