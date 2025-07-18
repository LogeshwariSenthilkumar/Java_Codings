import java.util.Scanner;
abstract class EventHandling{
    abstract void logindetails();
}
class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EventHandling e=new EventHandling(){
            void logindetails(){
                System.out.println("Enter whether the button is clicked or not");
                String isbutton=sc.nextLine();
                if(isbutton.equalsIgnoreCase("clicked")){
                    System.out.println("Login Successful");
                }
                else{
                    System.out.println("Login Unsuccessful");
                }
            }
        };
        e.logindetails();
    }
}