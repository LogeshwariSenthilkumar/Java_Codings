import java.util.Scanner;
class InvalidGradeException extends RuntimeException{
    InvalidGradeException(String s){
        super(s);
    }
}
class GradeValidator{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Grade:");
        char grade=sc.next().charAt(0);
        int cgpa;
        try{
            if(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='E' || grade=='F' )
        {
            if(grade=='A'){
               cgpa=10;
                System.out.println("The CGPA is : "+cgpa);
            }
            else if(grade=='B'){
                cgpa=8;
                 System.out.println("The CGPA is : "+cgpa);
            }
            else if(grade=='C'){
               cgpa=6;
                System.out.println("The CGPA is : "+cgpa);
            }
             else if(grade=='D'){
               cgpa=4;
                System.out.println("The CGPA is : "+cgpa);
            }
             else if(grade=='E'){
               cgpa=2;
                System.out.println("The CGPA is : "+cgpa);
            }
             else if(grade=='F'){
               cgpa=0;
                System.out.println("The CGPA is : "+cgpa);
            }
           
        }
        else{
            throw new InvalidGradeException("Grade InValid!!!");
        }
        }catch(InvalidGradeException e){
            System.out.println("GRADE INVALID!!!");

        }
     
    }
}