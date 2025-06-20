// abstract class Professors{
//     abstract String names(String name);
// }
class Professor1 {
    String professor_name1;
    Professor1(String professor_name1){
        this.professor_name1=professor_name1;
    }
    String displayProfDetails()
    {
         return professor_name1;
    }

}
class Professor2 {
    String professor_name2;
    Professor2(String professor_name2){
        this.professor_name2=professor_name2;
    }
    String displayProfDetails()
    {
         return professor_name2;
    }

}
class Professor3 {
    String professor_name3;
    Professor3(String professor_name3){
        this.professor_name3=professor_name3;
    }
     String displayProfDetails()
    {
         return professor_name3;
    }

}
class Professor4 {
    String professor_name4;
    Professor4(String professor_name4){
        this.professor_name4=professor_name4;
    }
     String displayProfDetails()
    {
         return professor_name4;
    }

}
class Department1{
   Professor1 ob1;
   Professor2 ob2;
   String dept_Name;
   Department1(String dept_Name,Professor1 ob1,Professor2 ob2)
   {
    this.ob1=ob1;
    this.ob2=ob2;
    this.dept_Name=dept_Name;
   }
   void displayDepartDetails(){
    System.out.println("\nDepartment_Name:"+dept_Name+"\n"+"Professors Name:"+"\n"+ob1.displayProfDetails()+"\n"+ob2.displayProfDetails());
   }
}
class Department2{
   Professor3 ob3;
   Professor4 ob4;
   String dept_Name2;
   Department2(String dept_Name2,Professor3 ob3,Professor4 ob4)
   {
    this.ob3=ob3;
    this.ob4=ob4;
    this.dept_Name2=dept_Name2;
   }
   void displayDepartDetails(){
     System.out.println("\nDepartment_Name:"+dept_Name2+"\n"+"Professors Name:"+"\n"+ob3.displayProfDetails()+"\n"+ob4.displayProfDetails());
   }
}
class College{
    Department1 ob5;
    Department2 ob6;
    String college_name;
    College(String college_name,Department1 ob5,Department2 ob6){
        this.college_name=college_name;
        this.ob5=ob5;
        this.ob6=ob6;
    }
    void displayCollegeDetails(){
        System.out.println("\nCollege_Name:"+college_name);
        ob5.displayDepartDetails();
        ob6.displayDepartDetails();

    }
}
class CollegeManagement{
    public static void main(String[] args){
        Professor1 p1=new Professor1("Janani");
        Professor2 p2=new Professor2("Logeshwari");
        Professor3 p3=new Professor3("Dhivya Dharshini");
        Professor4 p4=new Professor4("Barani");
        Department1 d1=new Department1("CSE",p1,p2);
        Department2 d2=new Department2("ECE",p3,p4);
        College c1=new College("VSB",d1,d2);
        c1.displayCollegeDetails();
        Professor1 p5=new Professor1("Sathish");
        Professor2 p6=new Professor2("Sharan");
        Professor3 p7=new Professor3("Sanjay");
        Professor4 p8=new Professor4("Dharanesh");
        Department1 d3=new Department1("CSE",p5,p6);
        Department2 d4=new Department2("EEE",p7,p8);
        College c2=new College("AVS",d3,d4);
        c2.displayCollegeDetails();
    }
}