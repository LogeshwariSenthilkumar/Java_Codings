class Student{
    Student(){
        System.out.println("Student Class Constructor...");
    }
    Student(String name){
        System.out.println(name);
    }
}
class Collage extends Student{
    Collage(){
        super("Logeshwari SenthilKumar");
        System.out.println("Collage Class Constructor...");
    }
}
class Demo2{
    public static void main(String[] args){
        Collage obj=new Collage();
    }

}