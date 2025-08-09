import java.io.*;
class A{
	public static void main(String[] args) throws IOException {
		FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file1.txt");
		String s1="Logeshwari Senthilkumar";
		byte[] b=s1.getBytes();
		fous.write(b);
		fous.close();
	    System.out.println("Success");
	    FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file1.txt");
	    int a;
	    while((a=fis.read())!=-1) {
	    	System.out.print((char)a);
	    }
	    fis.close();
	}
}