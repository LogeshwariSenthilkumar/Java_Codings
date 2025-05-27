import java.util.Scanner;
class Palindrome{
    public static void palindrome(String str){
        int i;
        String original=str.toLowerCase();
        String reverse="";
        for(i=(str.length()-1);i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if((reverse.toLowerCase()).equals(original)){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str1=sc.nextLine();
        palindrome(str1);
    }
}