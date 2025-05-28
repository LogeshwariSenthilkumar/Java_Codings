class Display{
    String name="Logu";
    public void show(){
        System.out.println("Hello Welcome!!!!");
    }
}
class User1 extends Display{
    public void greeting(){
        System.out.println(name);
        show();
    }

}
class Single{
    public static void main(String[] args)
    {
        User1 ob=new User1();
        ob.greeting();

    }

}