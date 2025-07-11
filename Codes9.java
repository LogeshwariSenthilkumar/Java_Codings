import java.util.Scanner;
class Demo{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       if(num%2==0){
        if(num%5==0){
            System.out.println("Even and Divisible by 5");
        }
       }
       else if(num%2!=0){
        if(num>50){
            System.out.println("Odd and Greater than 50");
        }
         else{
        System.out.println("Does not meet any condition");
       }
       }
      
    }
}