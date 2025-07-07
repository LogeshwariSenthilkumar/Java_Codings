// Fing all the substring:
import java.util.Scanner;
class StrCls8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
           for(int j=i+1;j<=s1.length();j++){
            System.out.print(s1.substring(i,j)+" ");
           }
        }
    }
}