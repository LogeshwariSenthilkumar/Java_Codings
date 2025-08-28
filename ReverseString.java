import java.util.*;
class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
         String s=sc.nextLine();
        ArrayDeque<Character> ad=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            ad.push(s.charAt(i));
        }
        System.out.println("Reversed String : ");
        for(Character ch:ad){
            System.out.print(ch);
        }
    }
}