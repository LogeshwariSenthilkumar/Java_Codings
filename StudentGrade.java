import java.util.Scanner;
abstract class Student{
    String name;
    int id;
    int mark1,mark2,mark3,mark4,mark5;
    double average;
    abstract void gradeCalculator();
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    void inputMarks(){
        System.out.println("Enter 5 Subject Marks:");
        Scanner sc=new Scanner(System.in);
        mark1=sc.nextInt();
        mark2=sc.nextInt();
        mark3=sc.nextInt();
        mark4=sc.nextInt();
        mark5=sc.nextInt();
    }
    void display(String name,int id,double average)
    {
       System.out.println("Name:"+name);
       System.out.println("Id:"+id);
       System.out.println("Average:"+average);
    }
}
class UGStudent extends Student{
    UGStudent(String name,int id){
        super(name,id);
    }

    void gradeCalculator(){
        inputMarks();
        average=(mark1+mark2+mark3+mark4+mark5)/5.0;
          System.out.println("-----------------------------------------------------------");
        System.out.println("UG CLASS:");
        display(name,id,average);
        if(average>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
         System.out.println("-----------------------------------------------------------");

    }

}
class PGStudent extends Student{
    PGStudent(String name,int id){
        super(name,id);
    }

    void gradeCalculator(){
        inputMarks();
        average=(mark1+mark2+mark3+mark4+mark5)/5.0;
          System.out.println("-----------------------------------------------------------");
         System.out.println("PG CLASS:");
        display(name,id,average);
        if(average>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
         System.out.println("-----------------------------------------------------------");

    }

}
class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Whether UG or PG?");
        String category=sc.nextLine();
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter ID:");
        int id=sc.nextInt();
        if(category.equals("UG")){
          UGStudent ug=new UGStudent(name,id);
        ug.gradeCalculator();
        }
        else if(category.equals("PG")){
             PGStudent pg=new PGStudent(name,id);
        pg.gradeCalculator();

        }
       
    

    }
}

