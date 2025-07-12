import java.util.Scanner;
class WeakPasswordException extends RuntimeException{
    WeakPasswordException(String s){
        super(s);
    }
}
class PasswordChecker{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s1="Weak Password";
      while(!s1.equals("Strong Password")){
        try{
          System.out.println("Enter the Password:");
       String pass=sc.nextLine();
       boolean isdigit=false;
       for(int i=0;i<pass.length();i++){
        char ch=pass.charAt(i);
        if(Character.isDigit(ch)){
            isdigit=true;
            break;

        }}
        if(pass.length()<8 || !isdigit){
            throw new WeakPasswordException("Weak Password");
        }
        else{
            boolean isupper=false;
            boolean isspecial=false;
            for(int i=0;i<pass.length();i++){
                char ch=pass.charAt(i);
                if(Character.isUpperCase(ch)){
                    isupper=true;
                    break;
                }
            }
            for(int i=0;i<pass.length();i++){
                char ch=pass.charAt(i);
                   if(!Character.isLetterOrDigit(ch)){
                    isspecial=true;
                    break;
            }}

            if(isupper && isspecial){
                System.out.println("Strong Password...");
                s1="Strong Password";
            }
            else{
                 System.out.println("Your password Does not contain Atleast one uppercase and one special Character...");
            }
        }
        }catch(WeakPasswordException e){
            System.out.println("Weak Password, Try Again...");
        }
         
      }
      
       
    }
}