import java.util.Scanner;
class UnderAgeException extends RuntimeException{
    UnderAgeException(String s){
        super(s);
    }
}
class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String s){
        super(s);
    }
}
class AgeVerification{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age=sc.nextInt();
          if(age<18){
            throw new UnderAgeException("Under Age");
          }
          else if(age>120){
            throw new InvalidAgeException("Invalid Age");
          }
        System.out.println("Eligible for Vote");
    }

}