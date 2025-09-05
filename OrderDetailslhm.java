import java.util.*;
class Order{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> order=new LinkedHashMap<>();
        order.put(101,"Kids Cotton Set");
        order.put(102,"PVC Shoe Rack");
        order.put(103,"Ethnic Kurtis");
        order.put(104,"Western Tops");
        order.put(105,"Home Decor");
        for(Map.Entry<Integer,String> map:order.entrySet()){
            System.out.println(map.getValue());
        }

    }
}