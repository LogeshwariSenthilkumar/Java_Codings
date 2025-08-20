import java.util.*;
class Stack5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<String> s1=new Stack<>();
        s1.push("Plate 1");
        s1.push("Plate 2");
        s1.push("Plate 3");
        s1.push("Plate 4");
        s1.push("Plate 5");
        s1.push("Plate 6");
         System.out.println(s1);
        boolean flag;
        while(s1.size()>1){
            System.out.println("Click Previous (true/false) : ");
            flag=sc.nextBoolean();
            if(flag){
                 s1.pop();
                System.out.println("Current Plate : "+s1.peek());
            }
            else {
                System.out.println("Stayed plate : " + s1.peek());
            }
            }
            s1.pop();
             System.out.println("No Plates Available");
    }
}