// Count Vowels and Consonants:
import java.util.Scanner;
class StrCls2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        String s2=s1.toLowerCase();
        int count_vowels=0;
        int count_Consonants=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' || s2.charAt(i)=='u'){
                  count_vowels++;
            }
            else{
                count_Consonants++;
            }
        }
        System.out.println("No.of Vowels: "+count_vowels);
        System.out.println("No.of Consonants: "+count_Consonants);
    }
}