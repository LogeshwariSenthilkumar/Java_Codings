import java.time.LocalDate;
import java.time.DayOfWeek;
class Main{
    public static void main(String[] args){
        LocalDate date=LocalDate.of(2003,6,24);
        DayOfWeek day=date.getDayOfWeek();
        System.out.println("Day : "+day);

    }
}