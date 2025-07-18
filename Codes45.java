import java.util.Scanner;
class Day{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Year (eg: 2003) :");
      int year=sc.nextInt();
      System.out.println("Enter the Month (1-12) : ");
      int month=sc.nextInt();
      System.out.println("Enter the Date (1-31) :");
      int date=sc.nextInt();
      if(month==1 || month==2){
        month+=12;
        year--;
      }
      int q=date;
      int m=month;
      int k=year%100;
      int j=year/100;
      int h=(q+(13*(m+1))/5+k+(k/4)+(j/4)+(5*j))%7;

      String[] days={"SATURDAY","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
      System.out.println("Day : "+days[h]);

    }
}