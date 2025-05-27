import java.util.Scanner;
class Returnwithargs
{
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        System.out.println("Result is:"+add(a1,b1));
    }
}