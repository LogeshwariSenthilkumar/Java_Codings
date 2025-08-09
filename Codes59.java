import java.io.*;
public class B {
   public static void main(String[] args) throws IOException {
	 FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file2.txt");
	 FileOutputStream fous2=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file3.txt");
	 ByteArrayOutputStream bas=new ByteArrayOutputStream();
	 bas.write(65);
	 bas.writeTo(fous);
	 bas.writeTo(fous2);
	 bas.close();
	 fous.close();
	 fous2.close();
	 System.out.println("Success");
   }
}
