import java.util.Scanner;
class Demo{
    static int a;
    static int b;
    static {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public static void main(String[] args){
        int c=a+b;
        System.out.println(c);
    }
}