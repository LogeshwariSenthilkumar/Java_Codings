import java.util.Scanner;
class Demo{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the two Numbers:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int sum;
         int diff;
         int prod;
         if(a>0 && b>0){
            sum=a+b;
               System.out.println(a+", "+b);
            System.out.println("Sum = "+sum);
         }
         else if(a<0 && b<0){
            prod=a*b;
               System.out.println(a+", "+b);
            System.out.println("Product = "+prod);
         }
         else if((a<0 && b>0) || (a>0 && b<0) ){
            diff=a-b;
            System.out.println(a+", "+b);
            System.out.println("Difference = "+diff);

         }
         else if(a==0 || b==0){
            System.out.println("Zero detected, computation skipped");
         }
     }
}