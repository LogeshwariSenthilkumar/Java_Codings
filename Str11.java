// Repeated:
import java.util.Scanner;
class StrCls10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        String result="";
        for(int i=0;i<s1.length();i+=2){
            char ch=s1.charAt(i);
            int count=s1.charAt(i+1)-'0';
            for(int j=0;j<count;j++){
                result+=ch;
            }
            
        }
        System.out.println(result);
    }
}