import java.util.*;
class LeaderBoard{
    public static void main(String[] args){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(700);
        ts.add(300);
        ts.add(500);
        ts.add(100);
        ts.add(200);
        System.out.println("Ascending : "+ts);
       TreeSet<Integer> tsDesc = new TreeSet<>(Collections.reverseOrder());
        tsDesc.addAll(ts);
        System.out.println("Descending : " + tsDesc);
    }
}