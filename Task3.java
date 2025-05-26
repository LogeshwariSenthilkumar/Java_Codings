import java.util.Scanner;
class Task3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter Score:");
        double score=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Department:");
        String dept=sc.nextLine();
        double d=score/10;
        System.out.println("Name:"+name);
        System.out.println("Score:"+score);
        System.out.println("Department:"+dept);
        System.out.println("Result:"+d+"/10");

    }
}