//Default:
interface Four2{
    default void show1(){
        System.out.println("Default Show Method");
    }
}
class Demo1 implements Four2{
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        d.show1();
    }
