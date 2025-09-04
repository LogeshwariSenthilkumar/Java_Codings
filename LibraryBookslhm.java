import java.util.*;
class Library{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> book=new LinkedHashMap<>();
        book.put(1949,"1984");
        book.put(1603,"Hamlet");
        book.put(1986,"It");
        book.put(1815,"Emma");
        book.put(1965,"Dune");
        for(Map.Entry<Integer,String> map:book.entrySet()){
            System.out.println(map.getValue());
        }

    }
}