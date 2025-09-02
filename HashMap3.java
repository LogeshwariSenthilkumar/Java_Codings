import java.util.*;
class Demo3{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(101,"Logu");
        hm.put(102,"Janu");
        hm.put(103,"Dhivya");
        hm.put(104,"Chitra");
        hm.put(105,"Barani");
        System.out.println(hm);
        hm.compute(101,(k,v)->v + "Senthil");
        hm.compute(106,(k,v)->"Hari");
        System.out.println(hm);

        hm.computeIfPresent(101,(k,v)->v+" Kumar");
        System.out.println(hm);
         hm.computeIfPresent(107,(k,v)->" sKumar");
         System.out.println(hm);
         hm.computeIfPresent(105,(k,v)->null);
         System.out.println(hm);

         hm.computeIfAbsent(107,k->"Bharath");
         System.out.println(hm);
         hm.computeIfAbsent(107,k->"Kumar");
         System.out.println(hm);
        //  System.out.println(hm);
    }
}