import java.util.Scanner;
class LoginSystem{
    String username;
    int password;
    LoginSystem(String username,int password){
        this.username=username;
        this.password=password;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LoginSystem l1;
        do{
            System.out.println("Enter Username:");
        String name1=sc.nextLine();
        System.out.println("Enter Password:");
        int pass=sc.nextInt();
        sc.nextLine();
           l1=new LoginSystem(name1,pass);
           if(l1.username.equals("Logeshwari") && l1.password==1234){
            System.out.println("Login Successfully!!!");
           }
           else{
            System.out.println("Invalid!!!");
           }
        }
        while(!l1.username.equals("Logeshwari") && l1.password!=1234);
        
        


    } 
}