import java.util.Scanner;
class Department{
    String dept_name;
    int dept_id;
    Department(String dept_name,int dept_id){
        this.dept_name=dept_name;
        this.dept_id=dept_id;
    }

}
class Student{
    String studName;
    int stuId;
    Department ob;
    int marks;
    Student(String studName,int stuId,Department ob,int marks){
        this.studName=studName;
        this.stuId=stuId;
        this.ob=ob;
        this.marks=marks;
    }
    void displayDetails(){
        System.out.println("Name:"+studName+"\n"+"Id:"+stuId+"\n"+"Department Name:"+ob.dept_name+"\n"+"Department Id:"+ob.dept_id+"\n"+"Marks:"+marks);
    }
    void grade(){
        if(marks<=90 && marks>80){
            System.out.println("A Grade");
        }
         else if(marks<=80 && marks>70){
            System.out.println("B Grade");
        }
         else if(marks<=70 && marks>60){
            System.out.println("C Grade");
        }
        else if(marks<=60 && marks>50){
            System.out.println("D Grade");
        }
        else if(marks>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

}
class Demo10{
    public static void main(String[] args){
        Department d1=new Department("CSE",1);
        Student s1=new Student("Logeshwari",55,d1,90);
        s1.displayDetails();
        s1.grade();
    }
}