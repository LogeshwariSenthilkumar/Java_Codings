import java.util.Scanner;
abstract class Course{
    String name;
    int id;
    int amount;
    String coursename1;
    String coursename2;
    Scanner sc=new Scanner(System.in);
    void inputname(){
       System.out.println("Enter the Name:");
        this.name=sc.nextLine();
        System.out.println("Enter the ID:");
        this.id=sc.nextInt();
        sc.nextLine();
    }
    void inputamount(){
        System.out.println("Enter the Amount You are Paying:");
        this.amount=sc.nextInt();
    }
    void display()
    {   System.out.println("----------------------------------------------------------------");
           System.out.println("\nDetails you Entered:");
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Amount you Paid:"+amount);
        System.out.println("CourseName1:"+coursename1);
           System.out.println("CourseName2:"+coursename2);
}
    
}
interface EnrollRules{
    void validStudentID();
    void courseLimit();
    void feeCheck();

}
class TechnicalCourse extends Course implements EnrollRules{
    
    public void validStudentID(){
        inputname();
        if(id!=0){
            System.out.println("Valid Id");
            courseLimit();
        }
        else{
            System.out.println("--------TRY AGAIN!!! Enter Valid Id--------");
            validStudentID();

        }
    }
    public void courseLimit(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter How many course you want?");
        int count=sc.nextInt();
        sc.nextLine();
        if(count<=2){
             for(int i=1;i<=count;i++){
            System.out.println("Enter Which Tech Course You want");
    System.out.println("\n1.Java Programming --- Rs.35000 \n2.Python Programming --- Rs.30000 \n3.C++ Programming --- Rs.25000 \n4.C Programming ---- Rs.20000");
    if(i==1){
      this.coursename1=sc.nextLine();
    }
    if(i==2){
        this.coursename2=sc.nextLine();
    }
        }
        feeCheck();
            
        }
        else{
            System.out.println("--------Minimum 2 Courses only Allowed... TRY AGAIN!!!---------");
            courseLimit();
        }

       
    }  
    public void feeCheck(){
        inputamount();
        if(amount>=1000){
            System.out.println("Eligible to Apply Course");
            display();
        }
        else{
            System.out.println("Not Eligible for Course");
        }

    }
    



}
class NonTechnicalCourse extends Course implements EnrollRules{
    
    public void validStudentID(){
        inputname();
        if(id!=0){
            System.out.println("Valid Id");
            courseLimit();
        }
        else{
            System.out.println("--------TRY AGAIN!!! Enter Valid Id--------");
            validStudentID();

        }
    }
    public void courseLimit(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter How many course you want?");
        int count=sc.nextInt();
        sc.nextLine();
        if(count<=2){
             for(int i=1;i<=count;i++){
            System.out.println("Enter Which Non-Tech Course You want");
    System.out.println("\n1.Business and Finance --- Rs.35000 \n2.Project Management--- Rs.30000 \n3.Arts and Humanities --- Rs.25000 \n4.Communication ---- Rs.20000");
    if(i==1){
      this.coursename1=sc.nextLine();
    }
    if(i==2){
        this.coursename2=sc.nextLine();
    }
        }
        feeCheck();
            
        }
        else{
            System.out.println("--------Minimum 2 Courses only Allowed... TRY AGAIN!!!--------");
            courseLimit();
        }

       
    }  
    public void feeCheck(){
        inputamount();
        if(amount>=1000){
            System.out.println("Eligible to Apply Course");
            display();
        }
        else{
            System.out.println("Not Eligible for Course");
        }

    }
    



}

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which one you want whether Tech Course or Non-Tech Course?");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("Tech Course")){
            System.out.println("You Chose Tech Course!!!");
            TechnicalCourse tt=new TechnicalCourse();
        tt.validStudentID();
        }
        else if(choice.equalsIgnoreCase("Non-Tech Course")){
            System.out.println("You Chose Non-Tech Course!!!");
           NonTechnicalCourse nt=new NonTechnicalCourse();
        nt.validStudentID();
        }
        


    }
}