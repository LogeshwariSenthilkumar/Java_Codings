import java.util.Scanner;
class Greater{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Both are Equal");
        }
        else{
            System.out.println("Both are not Equal");
        }
    }
}