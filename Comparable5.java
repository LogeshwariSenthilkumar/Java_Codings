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
            return 1;
        }
        else if(id>s.id){
            return -1;
        }
        else{
            return 0;
        }
    }
    // public int compareTo(Student s){
    //     return name.compareTo(s.name);
    // }
   
}
class Demo{
    public static void main(String[] args){
        PriorityQueue<Student> al=new PriorityQueue<>();
        al.add(new Student(104,"Logu"));
        al.add(new Student(102,"Dhivya"));
        al.add(new Student(101,"Janu"));
        al.add(new Student(105,"Barani"));
        al.add(new Student(103,"Chitra"));
        // TreeSet<Student> ts=new TreeSet<>(al);
        // Collections.sort(al);
         while (!al.isEmpty()) {
            System.out.println(al.poll());  // poll() gives elements in sorted order
        }
        // System.out.println(al);
    }
}