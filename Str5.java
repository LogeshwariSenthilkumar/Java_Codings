// Remove Duplicate Characters:
import java.util.Scanner;
class StrCls4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine().toLowerCase();
        char[] ch=s1.toCharArray();
        int[] count=new int[256];
        String s2="";
        for(int i=0;i<ch.length;i++){
            count[ch[i]]++;
        }
        for(int i=0;i<ch.length;i++){
            if(count[ch[i]]!=0){
                s2+=ch[i];
                count[ch[i]]=0;
            }
        }
        System.out.println("Result:"+s2);
    }
}