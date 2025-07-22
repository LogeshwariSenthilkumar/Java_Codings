import java.util.*;
import java.io.*;
class Count{
    public static void main(String[] args) throws IOException {
     File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\sample1.txt");
     FileWriter fw=new FileWriter(f1);
     fw.write("\n welcome to javaaaa");
     fw.close();
     System.out.println("Success..");
    }
}