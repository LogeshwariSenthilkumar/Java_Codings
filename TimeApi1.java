import java.time.*;
class Demo{
    public static void main(String[] args){

        //Current time:
        LocalTime t=LocalTime.now();
        System.out.println(t);

        //Specified time:
         LocalTime t1=LocalTime.of(10,34,56);
        System.out.println(t1);

        //Methods:
        LocalTime t2=LocalTime.now();
        System.out.println(t2.getHour());
        System.out.println(t2.getMinute());
        System.out.println(t2.getSecond());

        System.out.println(t2.plusHours(10));
        System.out.println(t2.plusMinutes(20));
        System.out.println(t2.plusSeconds(10));

        
    }
}