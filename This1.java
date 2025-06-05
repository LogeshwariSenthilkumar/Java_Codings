class Collage{
    Collage(){
        this(55);
        System.out.println("Collage Class Constructor...");
    } 
    Collage(int id){
        this("Logeshwari Senthilkumar");
        System.out.println(id);
    }
    Collage(String name){
        System.out.println(name);

    }

}
class Student extends Collage{
    Student(){
        System.out.println("Student Class Constructor...");
    }

}
class Demo1{
    public static void main(String[] args){
        Student obj=new Student();

    }
}