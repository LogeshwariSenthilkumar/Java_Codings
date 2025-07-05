// String Palindrome:
import java.util.Scanner;
class StrCls1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        if((s1.toLowerCase()).equals(s2.toLowerCase())){
            System.out.println("It is Palindrome..");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}