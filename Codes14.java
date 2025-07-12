import java.util.Scanner;
class UnderAgeException extends RuntimeException{
    UnderAgeException(String s){
        super(s);
    }
}
class InvalidNameException extends RuntimeException{
    InvalidNameException(String s){
        super(s);
    }
}
class BankAccount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1="Not Eligible";
        while(!s1.equals("Eligible")){
            try{
                try{
                    System.out.println("Enter the Name:");
        String name=sc.nextLine();
            for(int i=0;i<name.length();i++){
                char ch=name.charAt(i);
                if(Character.isDigit(ch) || !Character.isLetterOrDigit(ch)){
                    throw new InvalidNameException("Invalid Name");
                }
            }
                }catch(InvalidNameException e){
                    System.out.println("Invalid Name, Try Again");
                           System.out.println("Enter the Name:");
        String name=sc.nextLine();
                }
                System.out.println("Enter the Age:");
        int age=sc.nextInt();
          if(age<18){
            throw new UnderAgeException("Under Age");
        }
            }catch(UnderAgeException e){
                System.out.println("Invaild Age, Try Again");
                         System.out.println("Enter the Age:");
        int age=sc.nextInt();
            }
            System.out.println("Eligible for Account Creation");
            s1="Eligible";
        }
      
           
        
    }

}