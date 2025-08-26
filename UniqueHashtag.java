import java.util.*;
class UniqueHashTags{
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        String[] tweets = {
            "Loving #Java and #Coding challenges!",
            "Exploring #DataStructures and #Java concepts",
            "Working on a new project #Coding #Learning",
            "Follow for more updates #Learning #Tech"
        };
        for(String s:tweets){
            String[] word=s.split(" ");
            for(String words:word){
             if(words.startsWith("#")){
                hs.add(words);
            }
            }
        }
            
        
        System.out.println("UNSORTED :"+hs);
        TreeSet<String> ts=new TreeSet<>();
        ts.addAll(hs);
        System.out.println("SORTED : "+ts);
    }
}