import java.util.*;
class Cache{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> cache=new LinkedHashMap<>(16,0.75f,true);
        cache.put(1,"Browser Cache");
        cache.put(2,"CPU L1/L2 Cache");
        cache.put(3,"Database Cache");
        cache.get(1);
        cache.put(4,"DNS Cache");
        cache.put(5,"Application Cache");
        for(Map.Entry<Integer,String> map:cache.entrySet()){
            System.out.println(map.getValue());
        }

    }
}