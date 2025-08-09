import java.io.*;
public class E {
  public static void main(String[] args) throws IOException {
	  FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file5.txt");
	  DataOutputStream dos=new DataOutputStream(fous);
	  dos.writeInt(65);
	  dos.close();
	  fous.close();
	  System.out.println("Successful");
  }
}
