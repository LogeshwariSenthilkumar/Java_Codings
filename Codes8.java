import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values:");
        int count=0;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        int sum=0;
        if(n1>0 && n1%2==0){
            sum+=n1;
            count++;
        }
          if(n2>0 && n2%2==0){
            sum+=n2;
            count++;
        }
          if(n3>0 && n3%2==0){
            sum+=n3;
            count++;
        }
          if(n4>0 && n4%2==0){
            sum+=n4;
            count++;
        }
          if(n5>0 && n5%2==0){
            sum+=n5;
            count++;
        }
      
        System.out.println("Total valid values: "+count);
          if(sum<50){
            System.out.println("Sum = "+sum);
        }
        
    }

}