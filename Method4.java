import java.util.Scanner;
class Returnwithoutargs
{
    public int add()
    {
        System.out.println("Enter Two Numbers:");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        return c;
    }
    public static void main(String[] args)
    {
        Returnwithoutargs obj=new Returnwithoutargs();
        int d=obj.add();
        System.out.println("Result is:"+d);
    }
}