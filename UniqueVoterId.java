import java.util.*;
class UniqueVoterID{
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(101);
        hs.add(102);
        hs.add(203);
        hs.add(405);
        hs.add(230);
        hs.add(203);
        System.out.println(hs);
        Integer voter=203;
        int flag=0;
        for(Integer i:hs){
            if(i.equals(voter)){
                System.out.println("Already Registration");
                flag=1;
                break;
            }
        }
        if(flag==0){
                System.out.println("Not Registered");
        }
    }
}