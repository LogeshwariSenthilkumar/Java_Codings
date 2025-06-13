class Student{
    private String name;
    private int rollNumber;
    int marks;
    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void setName(){
        this.name=name;
    }
    public void setRollNumber(){
        this.rollNumber=rollNumber;
    }
}
class StudentGrade{
    public static void main(String[] args){
        Student s1=new Student("Logeshwari",55,98);
        Student s2=new Student("Janani",304,87);
        Student s3=new Student("Dhivya",21,78);
        double avg=(s1.marks+s2.marks+s3.marks)/3;
        System.out.println("Student Details:");
        System.out.println("\nStudent1:");
        System.out.println("Name:"+s1.getName());
        System.out.println("RollNo:"+s1.getRollNumber());
        System.out.println("Mark:"+s1.marks);
        System.out.println("\nStudent2:");
        System.out.println("Name:"+s2.getName());
        System.out.println("RollNo:"+s2.getRollNumber());
        System.out.println("Mark:"+s2.marks);
        System.out.println("\nStudent3:");
        System.out.println("Name:"+s3.getName());
        System.out.println("RollNo:"+s3.getRollNumber());
        System.out.println("Mark:"+s3.marks);
        System.out.println("\nAverage Mark of Three Students is:"+avg);


    }
}