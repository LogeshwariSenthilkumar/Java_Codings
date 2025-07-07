// Convert Integer to String without Integer.parseInt():
import java.util.Scanner;
class StrCls7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        int number=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int digit=ch -'0';
            number=number*10+digit;
        }
        System.out.println("Converted String is: "+number);
    }
}