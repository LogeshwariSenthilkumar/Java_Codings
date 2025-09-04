import java.util.*;
class Score{
    public static void main(String[] args){
        TreeMap<Integer,String> score=new TreeMap<>(Collections.reverseOrder());
        score.put(103,"Logu");
        score.put(101,"Chitra");
        score.put(105,"Sanjay");
        score.put(104,"Dhivya");
        score.put(102,"Senthil");
        for(Map.Entry<Integer,String> map:score.entrySet()){
            System.out.println(map.getValue());
        }

    }
}