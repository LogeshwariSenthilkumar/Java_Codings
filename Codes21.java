import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
class Demo1{
    public static void main(String[] args) throws IOException{
     File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\File.txt");
     f1.createNewFile();
     FileWriter fw=new FileWriter(f1);
     fw.write("Hi\n");
     fw.write("Hello\n");
     fw.write("Welcome\n");
     fw.write("My\n");
     fw.write("Name\n");
     fw.write("is\n");
     fw.write("Logeshwari\n");
     fw.write("End of the file....");
     fw.close();
    }
}