import java.util.*;

class ConferenceAttendees {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("logeshwari@example.com");
        hs.add("dhivya@example.com");
        hs.add("janani@example.com");
        hs.add("barani@example.com");
        hs.add("dhivya@example.com");

        System.out.println(hs);

        String email = "dhivya@example.com";
        if(hs.contains(email)){
            System.out.println("Already Registered");
        } else {
            System.out.println("Not Registered");
        }
    }
}
