import java.util.*;
import java.io.*;
class AppendFile{
    public static void main(String[] args) throws IOException {
     FileWriter fw=new FileWriter("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\sample.txt",true);
     fw.write("\nWelcome to Java!!!");
     fw.close();
     System.out.println("Appended Successfully...");
    }
}