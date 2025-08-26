import java.util.*;
class ProductId{
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(101);
        hs.add(102);
        hs.add(203);
        hs.add(405);
        hs.add(230);
        hs.add(203);
        System.out.println(hs);
        Integer id=203;
        int flag=0;
        for(Integer i:hs){
            if(i.equals(id)){
                System.out.println("Already Done");
                flag=1;
                break;
            }
        }
        if(flag==0){
                System.out.println("Not Done");
        }
    }
}