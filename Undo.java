import java.util.*;
class Texteditor{
    public static void main(String[] args){
        ArrayDeque<String> ad=new ArrayDeque<>();
        boolean run=true;
        Scanner sc=new Scanner(System.in);
        while(run){
            System.out.println("========== > TEXT EDITOR < =========");
            System.out.println("1.Add text");
            System.out.println("2.Undo Text");
            System.out.println("Enter the choice : ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the Text : ");
                    String text=sc.nextLine();
                    ad.push(text);
                    System.out.println(ad);
                    break;

                case 2:
                    if(!ad.isEmpty()){
                            ad.pop();
                    System.out.println(ad);
                    }
                    break;
                case 3:
                    run=false;
                    System.out.println("Closing");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            

        }
    }
}