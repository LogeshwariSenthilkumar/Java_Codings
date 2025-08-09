import java.io.*;
public class F {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file1.txt");
		DataInputStream dis=new DataInputStream(fis);
		int count=fis.available();
		byte[] b=new byte[count];
		dis.read(b);
		for(byte b1:b) {
			System.out.print((char)b1);
		}

	}

}
