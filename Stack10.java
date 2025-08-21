import java.util.*;
class Stack10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String brackets=sc.nextLine();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<brackets.length();i++){
            char ch=brackets.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[' ){
                stk.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']' ){
                if(stk.empty()){
                    System.out.println("Un Balanced...");
                    return;
                }
                char top=stk.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                   System.out.println("Un Balanced...");
                    return;
                }

            }
        }
        if(stk.empty()){
            System.out.println("Balanced ...");
        }
        else{
             System.out.println("Un Balanced...");
        }
    }
}