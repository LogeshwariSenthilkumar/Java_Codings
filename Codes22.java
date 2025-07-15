import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
class Demo2
{
    public static void main(String[] args) throws IOException{
     File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\File1.txt");
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

     FileReader fr=new FileReader(f1);
     int a;
     while((a=fr.read())!=-1){
        char ch=(char)a;
        System.out.print(ch);
     }
    }
}