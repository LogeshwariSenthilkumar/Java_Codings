import java.util.Scanner;
import java.io.*;
class UserInfo{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name=sc.nextLine();
        System.out.println("Enter the Age : ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Email : ");
        String email=sc.nextLine();
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\userinfo.txt");
        f1.createNewFile();
        FileWriter fw=new FileWriter(f1);
        fw.write("Name : "+name+"\n");
        fw.write("Age : "+age+"\n");
        fw.write("Email : "+email);
        fw.close();
        System.out.println("Userinfo.txt is created ...");


    }
}