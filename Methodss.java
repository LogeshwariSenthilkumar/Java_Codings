import java.util.Scanner;
class Methods{
    void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers For Addition:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("ADDITION RESULT:"+c);
        sub();
        mul();
        div();
    }
    void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers For Subtraction:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=a-b;
        System.out.println("SUBTRACTION RESULT:"+d);
    }
    void mul(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers For Multiplication:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int f=a*b;
        System.out.println("MULTIPLICATION RESULT:"+f);
    }
    void div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers For Division:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=a/b;
        System.out.println("DIVISION RESULT:"+g);
    }
}
class Demo{
    public static void main(String[] args){
        Methods ob=new Methods();
        ob.add();
    }
}