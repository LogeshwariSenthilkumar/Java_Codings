import java.util.*;

class RecentcontactList{
    public static void main(String[] args){
       LinkedHashSet<Long> hs = new LinkedHashSet<>();
        hs.add(6380931960l);
        hs.add(9566632146l);
        hs.add(9842407659l);
        hs.add(7373883777l);
        hs.add(9360704454l);

        for(Long i:hs){
            System.out.println(i);
        }
    }
}
