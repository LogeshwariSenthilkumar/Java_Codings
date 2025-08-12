import java.util.*;
class Student{
    String name;
    int id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
}
class Main{
    public static void main(String[] args)  
    {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student("Logu",55));
        al.add(new Student("Dhivya",21));
        al.add(new Student("Janu",304));
        for(Student s:al){
            System.out.println(s.name+" "+s.id);
        }
    }
    }