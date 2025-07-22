import java.util.*;
import java.io.*;
class SearchWords{
    public static void main(String[] args) throws IOException {
    File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\sample.txt");
     Scanner sc=new Scanner(f1);
     String target="Java";
     int flag=0;
     String lines="";
     while(sc.hasNextLine())
     {
        lines+=sc.nextLine();
     }
     String[] words=lines.split(" ");
     for(int i=0;i<words.length;i++){
        if(words[i].equalsIgnoreCase(target)){
            System.out.println("Word Available");
            flag=1;
            break;
        }
     }
     if(flag==0){
        System.out.println("Word Not Available");
     }
    }
}