import java.util.*;
class Song{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> song=new LinkedHashMap<>();
        song.put(101,"Para Para");
        song.put(102,"Vinmeen");
        song.put(103,"Oxygen");
        song.put(104,"Adiyae Azhagae");
        song.put(105,"Iragey");
        for(Map.Entry<Integer,String> map:song.entrySet()){
            System.out.println(map.getValue());
        }

    }
}