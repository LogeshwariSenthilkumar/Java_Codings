import java.util.*;
class Stack1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<String> s1=new Stack<>();
        s1.push("Home Page");
        s1.push("Page 1");
        s1.push("Page 2");
        s1.push("Page 3");
        s1.push("Page 4");
        System.out.println(s1);
        boolean flag;
        while(s1.size()>1){
            System.out.println("Click Previous (true/false) : ");
            flag=sc.nextBoolean();
            if(flag){
                 s1.pop();
                System.out.println("Current Page : "+s1.peek());
            }
            else {
                System.out.println("Stayed on: " + s1.peek());
            }
            }
            s1.pop();
             System.out.println("No History Available");
    }
}