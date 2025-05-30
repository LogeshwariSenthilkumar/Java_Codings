class Person{
    void displayInfo(){
        System.out.println("Displaying Info..."); 

    }
}
class Student extends Person{
    int rollno=101;
    void showRollNo(){
        System.out.println(rollno);
    }
}
class Demo{
    public static void main(String[] args){
        Student ob= new Student();
        System.out.println("Student Class:");
        ob.displayInfo();
        ob.showRollNo();
    }
}