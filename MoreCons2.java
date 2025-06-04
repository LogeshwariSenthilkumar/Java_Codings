//Constructor in Polymorphism:
class Student{
    Student()
    {
        System.out.println("I am Student Class Constructor");
    }
    Student(int roll)
    {
        System.out.println(roll);
    }
    Student(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        Student obj=new Student();
        Student obj2=new Student(55);
        Student obj3=new Student("Logeshwari Senthilkumar");
    }
}