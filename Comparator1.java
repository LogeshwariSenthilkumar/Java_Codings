import java.util.*;
class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}
class IdSort implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.id-s2.id;
    }
}
class NameSort implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class Demo{
    public static void main(String[] args){
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(104,"Logu"));
        al.add(new Student(102,"Dhivya"));
        al.add(new Student(101,"Janu"));
        al.add(new Student(105,"Barani"));
        al.add(new Student(103,"Chitra"));
        Collections.sort(al,new IdSort());
         System.out.println(al);
        Collections.sort(al,new NameSort());
        System.out.println(al);
    }
}