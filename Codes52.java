import java.util.Scanner;
class Person{
String firstName;
String lastName;
int idNo;
int[] scores;
Person(String firstName,String lastName,int idNo,int[] scores){
    this.firstName=firstName;
    this.lastName=lastName;
    this.idNo=idNo;
    this.scores=scores;

}
void display(){
    System.out.println("Name : "+firstName+" , "+lastName);
    System.out.println("ID : "+idNo);
}
}
class Student extends Person{
Student(String firstName,String lastName,int idNo,int[] scores){
super(firstName,lastName,idNo,scores);
}
char calculatorGrade(int n){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=scores[i];
    }
    int avg=sum/2;
    System.out.println(avg);
    if(avg>=90 && avg<=100){
        return 'O';
    }
    else if(avg>=80 && avg<90){
        return 'E';
    }
    else if(avg>=70 && avg<80){
        return 'A';
    }
    else if(avg>=55 && avg<70){
        return 'P';
    }
    else if(avg>=40 && avg<55){
        return 'D';
    }
    else{
        return 'T';
    }
}
}
class GradeCalculator{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
      String firstName;
      String lastName;
      int idNo;
      int[] scores;
    //  System.out.println("Enter the FirstName : ");
     firstName=sc.nextLine();
     if(1<=firstName.length()){
    //   System.out.println("Enter the LastName : ");
     lastName=sc.nextLine();
     if(lastName.length()<=10)
     {
        // System.out.println("Enter the Id : ");
        idNo=sc.nextInt();
        sc.nextLine();
        // String idAsString=String.valueOf(idNo);
        // int len=idAsString.length();
        int flag=0;
        if(idNo>=1000000 && idNo<=9999999){
        // System.out.println("Enter the Scores : ");
        int n=sc.nextInt();
        scores=new int[n];
        int i=0;
        while(i<n){
           scores[i]=sc.nextInt();
            if(scores[i]<0 || scores[i]>100){
                flag=1;
                break;
            }
            i++;
        }
        if(flag==0){
          Student ob=new Student(firstName,lastName,idNo,scores);
        ob.display();
        System.out.println("Grade : "+ob.calculatorGrade(n));
        }
        }
     }
     }
    }
}