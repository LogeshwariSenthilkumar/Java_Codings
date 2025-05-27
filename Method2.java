import java.util.Scanner;
class Noreturnwithoutargs{
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Result is:"+c);

    }

    public static void main(String[] args)
    {
        Noreturnwithoutargs ob=new Noreturnwithoutargs();
        ob.add();

    }
}