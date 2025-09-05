import java.util.*;
class Websites{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> website=new LinkedHashMap<>();
        website.put(101,"Myntra");
        website.put(102,"Shopsy");
        website.put(103,"Meesho");
        website.put(104,"Whatsapp");
        website.put(105,"FaceBook");
        for(Map.Entry<Integer,String> map:website.entrySet()){
            System.out.println(map.getValue());
        }

    }
}