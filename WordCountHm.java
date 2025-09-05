import java.util.*;
class WordCounter{
    public static void main(String[] args){
        HashMap<String,Integer> count=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Paragraph : ");
        String sentence=sc.nextLine().toLowerCase();
        String[] words=sentence.split("\\W+");
        for(String word:words){
            count.put(word,count.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> map:count.entrySet()){
            System.out.println(map.getKey()+" : "+map.getValue());
        }
    }
}