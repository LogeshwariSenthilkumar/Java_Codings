import java.util.Scanner;
class Demo{
    public static String StudentName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Name:");
        String name=sc.nextLine();
        return name;
    }
    public static void main(String[] args)
    {
        Demo ob=new Demo();
        System.out.println("The Name is:"+StudentName());

    }
}