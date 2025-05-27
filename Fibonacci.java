import java.util.Scanner;
class Task3{
    public void printFibonacci(int n){
        int a=0;
        int b=1;
        int i;
        System.out.println("The Fibonacci series is:");
         if(n==1){
                System.out.println(a);
            }
        else if(n==2)
            {
                System.out.println(a);
                 System.out.println(b);
            }
        else{
            System.out.println(a);
            System.out.println(b);
            }
            
        for(i=3;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }


    }
    public static void main(String[] args)
    {
        Task3 ob=new Task3();
        System.out.println("Enter Terms:");
        Scanner sc=new Scanner(System.in);
        int term=sc.nextInt();
        ob.printFibonacci(term);

    }
}