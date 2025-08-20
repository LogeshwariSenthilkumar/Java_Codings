import java.util.*;
class Stack4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s=sc.nextLine();
        Stack s1=new Stack();
        for(int i=0;i<s.length();i++){
            s1.push(s.charAt(i));
        }
        System.out.println("Reversed String is : ");
        for(int i=s1.size();i>=1;i--){
            System.out.print(s1.peek());
            s1.pop();
        }
    }
}