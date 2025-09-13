import java.time.*;
import java.time.format.*;
class Demo{
    public static void main(String[] args){
        //current dateTime:
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        // for(String val:ZoneId.getAvailableZoneIds()){
        //     System.out.print(val+",");
        // }

        LocalDateTime dt2=LocalDateTime.now(ZoneId.of("America/Toronto"));
        System.out.println(dt2);

        //formatted:
        DateTimeFormatter formatted=DateTimeFormatter.ofPattern("dd-MM-YYYY HH::mm::ss");
        String formatteds=dt.format(formatted);
        System.out.println(formatteds);
    }
}