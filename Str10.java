// Check if string contains string only:
import java.util.Scanner;
class StrCls9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        boolean isDigit=true;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(!Character.isDigit(ch))
            {
                 isDigit=false;
                 break;
            }
        }
        if(isDigit){
            System.out.println("The String contains only Digits");
        }
        else{
            System.out.println("The String Does not contain only Digits");
        }
        
    }
}