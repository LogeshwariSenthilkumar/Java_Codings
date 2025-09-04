import java.util.*;
class Login{
    public static void main(String[] args){
        HashMap<String,Integer> login=new HashMap<>();
        login.put("Logu",1010);
        login.put("Chitra",1012);
        login.put("Senthil",1014);
        login.put("Sanjay",1016);
        login.put("Dhivya",1017);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the User name : ");
        String name=sc.nextLine();
        System.out.println("Enter the PassWord : ");
        int pass=sc.nextInt();
        if(login.containsKey(name) && login.get(name)==pass){
            System.out.println("Login Successfull...");
        }
        else{
            System.out.println("UnSuccesfull....");
        }
        
    }
}