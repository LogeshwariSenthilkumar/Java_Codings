import java.util.Scanner;
class Factorial{
    public void factorial(int n){
        int fact=1;
        int i;
        System.out.println("Factorial is:");
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);

    }
    public static void main(String[] args)
    {
        Factorial ob=new Factorial();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        ob.factorial(num);
    }
}