import java.util.*;
class Task3{
    public static void main(String[] args){
        Stack<Integer> stk=new Stack<>();
        stk.push(40);
        stk.push(90);
        stk.push(42);
        stk.push(30);
        stk.push(20);
        System.out.println(stk);
        for(int i=stk.size();i>=1;i--){
            System.out.println(stk.peek());
            stk.pop();
        }
         System.out.println(stk);

    }
}