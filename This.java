class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("ID:"+id+" "+"Name:"+name);
    }
}
class Demo{
    public static void main(String[] args){
        Student su=new Student(55,"Logeshwari Senthilkumar");
        Student su1=new Student(304,"Janani");
        Student su2= new Student(21,"Dhivya Dharshini");
    }
}