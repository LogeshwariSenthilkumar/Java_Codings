import java.util.Scanner;
class PrerequisiteNotMetException extends RuntimeException{
    PrerequisiteNotMetException(String s){
        super(s);
    }
}
class CourseFullException extends RuntimeException{
    CourseFullException(String s){
        super(s);
    }
}
class OnlineCourse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max_seats=30;
        int registered=0;
        while(registered<max_seats){
            try{
                System.out.println("\nHi, Welcome To the Course Registration!!!");
                System.out.println("Enter the Name:");
           String name=sc.nextLine();
           System.out.println("Enter the Course Name:");
           String course_name=sc.nextLine();
        System.out.println("Enter whether you Completed the Prerequisite course completed or not? give the answer is true or false");
        boolean iscomplete=sc.nextBoolean();
        sc.nextLine();
        if(!iscomplete){
            throw new PrerequisiteNotMetException("Not Completed Prerequisite Course");
        }
         registered++;
          System.out.println("Successfully Registered");
            }catch(PrerequisiteNotMetException e){
                System.out.println(e);
                System.out.println("Skipping this Student and continue next student\n");
            }
           

        }
        try{
          throw new CourseFullException("Course full");
        }
        catch(CourseFullException e){
            System.out.println("Sorry Course Booking Completed");
        }
        
         

    }
}