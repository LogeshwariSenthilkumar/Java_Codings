class Greeting{
    void sayHello(){
        System.out.println("Saying Hello...");
    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
    void sayHello(String name,String timeOfDay){
        System.out.println("Hello "+name+" "+"Time:"+timeOfDay);
    }
}
class Demo{
    public static void main(String[] args)
    {
        Greeting g=new Greeting();
        g.sayHello();
        g.sayHello("Logeshwari");
        g.sayHello("Logeshwari","9 P.m");

    }
}