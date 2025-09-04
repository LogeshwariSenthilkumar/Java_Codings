import java.util.*;
class Marks{
    public static void main(String[] args){
        TreeMap<String,Integer> mark=new TreeMap<>();
        mark.put("Logu",98);
        mark.put("Chitra",89);
        mark.put("Sanjay",87);
        mark.put("Dhivya",86);
        mark.put("Senthil",99);
        for(Map.Entry<String,Integer> map:mark.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

    }
}