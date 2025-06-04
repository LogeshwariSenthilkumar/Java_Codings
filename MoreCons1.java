//Constructor in Inhertiance:
class School{
    int id=1;
    School(){
        this("SSVM");
        System.out.println("School class Constructor!!!");
    }
    School(String name){
        this(2);
        System.out.println(name);
    }
    School(int roll){
        System.out.println(roll);
    }
}
class Student extends School{
    Student(){
        super();
        System.out.println("Student Class Constructor!!!");
    }

}
class Demo{
    public static void main(String[] args){
        Student st=new Student();
        System.out.println(st.id);

    }
}