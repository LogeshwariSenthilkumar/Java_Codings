import java.io.*;
public class C {

	public static void main(String[] args) {
		byte[] b= {65,97,48,35};
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
		int a;
		while((a=bis.read())!=-1) {
			System.out.println("ASCII Value : "+a+" Original Value : "+(char)a);
		}

	}

}
