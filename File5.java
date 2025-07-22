import java.util.*;
import java.io.*;
class CountWords{
    public static void main(String[] args) throws IOException {
     File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\sample.txt");
     f1.createNewFile();
     FileWriter fw=new FileWriter(f1);
     fw.write("I Like Java Programming ");
     fw.write("\nhi hello ");
     fw.write("\nWelcome to Java");
     fw.close();
     Scanner sc=new Scanner(f1);
     String lines="";
     while(sc.hasNextLine())
     {
        lines+=sc.nextLine();
     }
     String[] words=lines.split(" ");
     System.out.println("Words count is : "+ words.length);
    }
}