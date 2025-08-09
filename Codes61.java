import java.io.*;
public class D {
  public static void main(String[] args) throws IOException {
	  FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file4.txt");
	  FilterOutputStream fious=new FilterOutputStream(fous);
	  fious.write(65);
	  fious.close();
	  fous.close();
	  System.out.println("Success!!");
	  FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file4.txt");
	  FilterInputStream fiis=new BufferedInputStream(fis);
	  int a=fiis.read();
	  System.out.println((char)a);
	  
  }
}
