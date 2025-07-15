import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
class Demo4
{
    public static void main(String[] args) throws IOException{
     File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\File3.txt");
     f1.createNewFile();
     FileWriter fw=new FileWriter(f1);
     fw.write("Hi\n");
     fw.write("Hello\n");
     fw.write("Welcome to\n");
     fw.write("My\n");
     fw.write("Name\n");
     fw.write("is\n");
     fw.write("Logeshwari\n");
     fw.write("End of the file....");
     fw.close();

     Scanner sc=new Scanner(f1);
     while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
     }

    }
}