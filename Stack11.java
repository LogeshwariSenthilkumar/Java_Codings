import java.util.*;
class Stack11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PostFix Expression : ");
        String exp=sc.nextLine();
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch - '0';
                stk.push(num);
            }
            else{
                if(ch=='+'){
                int ele1=stk.pop();
                int ele2=stk.pop();
                int res=ele1+ele2;
                stk.push(res);
                }
                else if(ch=='-'){
                int ele1=stk.pop();
                int ele2=stk.pop();
                int res=ele1-ele2;
                stk.push(res);
                }
                else if(ch=='*'){
                int ele1=stk.pop();
                int ele2=stk.pop();
                int res=ele1*ele2;
                stk.push(res);
                }
                else if(ch=='/'){
                int ele1=stk.pop();
                int ele2=stk.pop();
                int res=ele1/ele2;
                stk.push(res);
                }
                else if(ch=='%'){
                int ele1=stk.pop();
                int ele2=stk.pop();
                int res=ele1%ele2;
                stk.push(res);
                }
            }
           
        }
        System.out.println("The Result is : "+stk);
    }
}