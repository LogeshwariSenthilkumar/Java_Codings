// String Reverse:
import java.util.Scanner;
class StrCls{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        System.out.println("Reversed String is:"+s2);
    }
}