import java.io.*;
class B{
    public static void main(String[] args) throws IOException{
       byte[] b={97,65,48,35};
       ByteArrayInputStream bai=new ByteArrayInputStream(b);
       int i;
       while((i=bai.read())!=-1){
        char c=(char)i;
        System.out.println("ASCII Value : "+i+" Original Value : "+c);
       }
    }
}