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
        HashMap<Student,Integer> al=new HashMap<>();
        al.put(new Student(104,"Logu"),1);
        al.put(new Student(102,"Dhivya"),2);
        al.put(new Student(101,"Janu"),3);
        al.put(new Student(105,"Barani"),4);
        al.put(new Student(103,"Chitra"),5);
        TreeMap<Student,Integer> tmbyId=new TreeMap(new IdSort());
        tmbyId.putAll(al);
         System.out.println(tmbyId);
         TreeMap<Student,Integer> tmbyName=new TreeMap(new NameSort());
        tmbyName.putAll(al);
         System.out.println(tmbyName);
    }
}