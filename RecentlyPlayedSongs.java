import java.util.*;
class RecentlyPlayedSong{
    public static void main(String[] args){
        LinkedHashSet<String> hs=new LinkedHashSet<>();
        hs.add("Para Para");
        hs.add("Vinmeen");
        hs.add("Oxygen");
        hs.add("Adiyae Azhagae");
        hs.add("Aasa Orave");
        hs.add("Oxygen");

        for(String s:hs){
            System.out.println(s);
        }
    }
}