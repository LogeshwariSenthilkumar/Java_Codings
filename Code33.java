import java.util.*;
class Demo1{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(10,"Logu");
        hm.put(20,"Janu");
        hm.put(30,"Hari");
        hm.put(40,"Bharath");
        hm.put(50,"Chitra");
        // System.out.println(hm);

        hm.putIfAbsent(60,"Logeshwari");
        System.out.println(hm);
        for(Map.Entry map:hm.entrySet()){
            // System.out.println(map.getKey());
            // System.out.println(map.getValue());
            if(map.getKey().equals(10)){
                map.setValue("LogeshwariSenthilkumar");
            }
        }
        System.out.println(hm);

        // hm.remove(20);
        // System.out.println(hm);
        // hm.remove(30,"Hari");
        //  System.out.println(hm);

        // System.out.println(hm.get(10));
        // System.out.println(hm.getOrDefault(70,"Senthil"));
        // System.out.println(hm.size());
        // System.out.println(hm.isEmpty());
        // System.out.println(hm.keySet());
        // System.out.println(hm.values());
        // System.out.println(hm.containsKey(10));
        // System.out.println(hm.containsValue("Logu"));
        // hm.compute(10,(k,v)->v+"Senthil");
        //  hm.compute(80,(k,v)->"Senthil");
        // hm.computeIfAbsent(90,k->"Senthil");
        // hm.computeIfPresent(10,(k,v)->v+"Chitra");
        // hm.computeIfPresent(10,(k,v)->null);
        // hm.computeIfPresent(20,(k,v)->"JANNA");

        // hm.replace(10,"LOGU");
        // hm.replace(30,"HAri");
        // hm.replaceAll((k,v)->v.toUpperCase());
        // hm.merge(10,"Mango",(oldVal,newVal)->(oldVal+newVal));
        // hm.merge(100,"Mango",(oldVal,newVal)->(oldVal+newVal));

        // System.out.println(hm);


        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.putAll(hm);
        hm1.clear();
        //  System.out.println(hm1);
    }
}