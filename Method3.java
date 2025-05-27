import java.util.Scanner;
class Noreturnwithargs{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Result is:"+c);
    }
    public static void main(String[] args)
    {
        Noreturnwithargs ob= new Noreturnwithargs();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        ob.add(a1,b1);
    }
}