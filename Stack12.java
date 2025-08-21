import java.util.*;
class Stack12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        Stack<String> stk=new Stack<>();
        while(run){
            System.out.println("Enter Path : ");
            String path=sc.nextLine();
            if(path.equalsIgnoreCase("Dead End")){
               break;
            }
            stk.push(path);
        }
        System.out.println("Path Taken : ");
         for(String s:stk){
            System.out.print(s+" - > ");
        }
       System.out.println("\nBackTracking : ");
        while(!stk.empty()){
            System.out.print(stk.pop()+" - > ");
        }
    }
}