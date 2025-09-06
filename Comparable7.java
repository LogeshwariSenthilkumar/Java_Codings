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
        HashMap<Student,Integer> al=new HashMap<>();
        al.put(new Student(104,"Logu"),1);
        al.put(new Student(102,"Dhivya"),2);
        al.put(new Student(101,"Janu"),3);
        al.put(new Student(105,"Barani"),4);
        al.put(new Student(103,"Chitra"),5);
        TreeMap<Student,Integer> tm=new TreeMap<>(al);
        System.out.println(tm);
    }
}