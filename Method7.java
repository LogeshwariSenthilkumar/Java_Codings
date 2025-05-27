import java.util.Scanner;
class Demo2{
    public static String StudentName(String name){
        return name;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Name:");
        String name1=sc.nextLine();
        System.out.println("The Student Name is:"+StudentName(name1));
    }
}