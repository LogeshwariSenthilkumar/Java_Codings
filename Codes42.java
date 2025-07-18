import java.util.Scanner;
class College{
    void collegeDetails(){
        String clg_name="VCEW";
        String address="Tiruchengode";
        System.out.println("College Name : "+clg_name);
        System.out.println("Address : "+address);
    }
    void generateResult(String name,int score){
        class Result{
            void resultChecker(String name,int score){
                System.out.println("Student Name : "+name);
                if(score>=35){
                    System.out.println("Result : Pass");
                }
                else{
                    System.out.println("Result : Fail");
                }

            }

        }
        Result r=new Result();
        r.resultChecker(name,score);

    }
}
class Main{
    public static void main(String[] args){
        College c=new College();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Name :");
        String name=sc.nextLine();
        System.out.println("Enter the Marks :");
        int score=sc.nextInt();
         c.collegeDetails();
        c.generateResult(name,score);
    }
}