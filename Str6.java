// Check is Two Strings are Anagrams:
import java.util.*;
class StrCls5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1:");
        String s1=sc.nextLine().toLowerCase();
        System.out.println("Enter the String2:");
        String s2=sc.nextLine().toLowerCase();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("It is Anagram...");
        }
        else{
            System.out.println("Not a Anagram...");
        }
    }
}
