import java.io.*;
class D{
    public static void main(String[] args) throws IOException{
       FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file16.txt");
       DataInputStream dis=new DataInputStream(fis);
       int count=fis.available();
       byte[] b=new byte[count];
       dis.read(b);
       for(byte b1:b){
        System.out.print((char)b1+"-");
       }
       dis.close();
       fis.close();
    }
}