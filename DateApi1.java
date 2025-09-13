import java.time.*;
class Demo{
    public static void main(String[] args){
        //Date today:
        LocalDate date=LocalDate.now();
        System.out.println(date);

        //Date of Specified:
        LocalDate date1=LocalDate.of(2003,06,25);
        System.out.println(date1);

        LocalDate date3=LocalDate.of(2003,Month.JUNE,25);
        System.out.println(date3);
         
        //Methods:
        LocalDate d=LocalDate.now();
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfYear());

        //Plus:
        LocalDate d1=LocalDate.now();    
        System.out.println(d1.plusDays(10)); 
        System.out.println(d1.minusDays(10)); 
        System.out.println(d1.plusMonths(2)); 
        System.out.println(d1.minusMonths(2)); 
        System.out.println(d1.plusYears(10)); 
        System.out.println(d1.minusYears(10)); 



    }
}