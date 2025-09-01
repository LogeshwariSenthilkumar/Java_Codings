import java.util.*;
class Demo1{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        //put(k,v);
        hm.put(101,"Logu");
        hm.put(102,"Janu");
        hm.put(103,"Dhivya");
        hm.put(104,"Chitra");
        hm.put(105,"Barani");
        System.out.println(hm);
        hm.put(101,"Logeshwari");
        System.out.println(hm);

        //putIfAbsent(k,v);
        hm.putIfAbsent(106,"Hari");
        System.out.println("Original : "+hm);

        //merge(k,v,fn);
        // hm.merge(107,"Mango",(oldVal,newVal)->(oldVal+newVal));
        //  hm.merge(102,"Orange",(oldVal,newVal)->(oldVal+newVal));
        


        // //replaceAll(fn);
        // hm.replaceAll((k,v)->v.toUpperCase());

        //replace(k);
        // hm.replace(101,"LOG");
        // System.out.println(hm);

        // //replace(k,v);
        // hm.replace(102,"Janu","JANUU");

        //remove(key):
        // hm.remove(101);
        // System.out.println(hm);

        //remove(k,v):
        // hm.remove(103,"Dhivya");
        // System.out.println(hm);

        //clear();
        // hm.clear();
        // System.out.println(hm);

        //get(k);
        // System.out.println(hm.get(101));

        //getOrDefault(k,default);
        // System.out.println(hm.getOrDefault(107,"Logu"));

        //isEmpty();
        // System.out.println(hm.isEmpty());

        //size();
        // System.out.println(hm.size());

        //containsValue(v);
        // System.out.println(hm.containsValue("Janu"));

        //containsKey(k);
        // System.out.println(hm.containsKey(102));
        
        //Collections values();
        Collection<String> values=hm.values();
        // System.out.println(values);

        //set keys();
        Set<Integer> keys=hm.keySet();
        // System.out.println(keys);

        //putAll(collection);
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.putAll(hm);
        // System.out.println(hm1);

        //Entry:
        for(Map.Entry mm :hm.entrySet()){
            // System.out.println(mm.getKey());
            // System.out.println(mm.getValue());
            if(mm.getValue().equals("Logeshwari")){
                mm.setValue("Senthil");
            }
        }
        System.out.println(hm);

    }
}