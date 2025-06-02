class Printer{
    void print(String message){
        System.out.println(message);
    }
    void print(int number){
        System.out.println(number);
    }
    void print(double number){
        System.out.println(number);
    }
}
class Demo{
    public static void main(String[] args)
    {
        Printer p=new Printer();
        p.print("Hello Haiii");
        p.print(055);
        p.print(78.9);

    }
}