// Constructor in Abstraction:
abstract class Demo{
    Demo(){
        System.out.println("Constructor inside Abstract class");
    }
}
class Abstract extends Demo{
    public static void main(String[] args){
        Abstract obj=new Abstract();
    }
}