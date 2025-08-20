import java.util.*;
class Stack6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mathematical Expression : ");
        String s=sc.nextLine();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }
            else if(ch ==')' || ch=='}' || ch==']')
            {
                if(stk.isEmpty()){
                    System.out.println("UnBalanced");
                    return;
                }
                    char top = stk.pop();
                      if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                         System.out.println("UnBalanced");
                         return;
                    }
            }
        }
        if(stk.isEmpty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("UnBalanced");
        }
    }
}