import java.util.*;
class Stack2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack s1=new Stack();
        boolean run=true;
        int choice;
        while(run){
            System.out.println("========== TEXT EDITOR =========");
            System.out.println("1.Add Words");
            System.out.println("2.Undo");
            System.out.println("3.Stop");
            System.out.println("Enter the Choice : ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the Word : ");
                    s1.push(sc.nextLine());
                    System.out.println(s1);
                    break;
                case 2:
                    s1.pop();
                    System.out.println(s1);
                    break;
                case 3:
                    run=false;
                    System.out.println("Exiting ....");
                    break;
                default:
                    System.out.println("Invalid Choice ...");
                          
            }
        }
        
    }
}