import java.util.*;
class Demo{
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(10,"Logu");
        ht.put(20,"Hari");
        ht.put(30,"Janu");
        ht.put(40,"Barani");
        ht.put(50,"Chitra");
        ht.put(60,"Senthil");
        System.out.println(ht);
        // ht.clear();
        // ht.remove(60);
        // ht.remove(50,"Chitra");
        // System.out.println(ht.get(60));
        // System.out.println(ht.keySet());
        // System.out.println(ht.values());
        // System.out.println(ht.containsKey(60));
        // System.out.println(ht.containsValue("Logu"));
        // ht.compute(10,(k,v)->v+"SenthilK");
        // System.out.println(ht.isEmpty());
        // System.out.println(ht.size());
        // System.out.println(ht.getOrDefault(90,"LOOOO"));
        // ht.putIfAbsent(70,"Sanjay");
        // // Hashtable<Integer,String> ht1=new Hashtable<>();
        // // ht1.putAll(ht);
        // ht.replace(20,"HHH");
        // ht.replace(30,"Janu","JJJ");
        // ht.replaceAll((k,v)->v.toUpperCase());
        // ht.merge(10,"Mango",(oldVal,newVal)->(oldVal+newVal));
        for(Map.Entry<Integer,String> map:ht.entrySet()){
               System.out.println(map.getKey()+" "+map.getValue());
        }
        



    }
}