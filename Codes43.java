import java.util.Scanner;
class Login{
    void validateLogin(String name,int pass){
        class Credentials{
            void checkLogin(String name,int pass){
               if(name.equals("Logeshwari Senthilkumar") && pass==2003){
                System.out.println("User Name : "+name);
                System.out.println("Password : "+pass);
                System.out.println("Login Successful");
               }
               else{
                System.out.println("Login Unsuccessful, Invalid UserName or Password");
               }
            }
        }
        Credentials c=new Credentials();
        c.checkLogin(name,pass);
    }
}
class Main{
    public static void main(String[] args){
        Login l=new Login();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the UserName :");
        String name=sc.nextLine();
        System.out.println("Enter the Password : ");
        int pass=sc.nextInt();
        l.validateLogin(name,pass);
    }
}