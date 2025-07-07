// Find the first non-repeating Character:
import java.util.Scanner;
class StrCls6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine().toLowerCase();
        char[] ch=s1.toCharArray();
        int[] count=new int[256];
        int flag=0;
        for(int i=0;i<ch.length;i++){
            count[ch[i]]++;
        }
        for(int i=0;i<ch.length;i++){
            if(count[ch[i]]==1){
                System.out.println(ch[i]);
                flag=1;
                count[ch[i]]=0;
            }
            if(flag==1){
                break;
            }
        }
    }
}