import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
    public int compareTo(Student s){
        if(id<s.id)
        {
            return -1;
        }
        else if(id>s.id){
            return 1;
        }
        else{
            return 0;
        }
    }
    // public int compareTo(Student s){
    //     return s.name.compareTo(name);
    // }
   
}
class Demo{
    public static void main(String[] args){
        Stack<Student> al=new Stack<>();
        al.push(new Student(104,"Logu"));
        al.push(new Student(102,"Dhivya"));
        al.push(new Student(101,"Janu"));
        al.push(new Student(105,"Barani"));
        al.push(new Student(103,"Chitra"));
        Collections.sort(al);
        System.out.println(al);
    }
}