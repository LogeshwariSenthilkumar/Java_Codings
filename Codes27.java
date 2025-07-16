class University{
    String university_name="Anna University";
    private int university_id=90;
    class Department{
      String dept_name="CSE";
      int dept_id=1;
      void displayDetails(){
        System.out.println("University Name : "+university_name);
        System.out.println("University Id : "+university_id);
       System.out.println("Department Name : "+dept_name);
       System.out.println("Department Id : "+dept_id);
      }
    }
     static void displayUniversityDetails(){
        
       University u=new University();
       University.Department d=u.new Department();
        d.displayDetails();
    }
}
class Demo1{
    public static void main(String[] args){
        University.displayUniversityDetails();

    }
}