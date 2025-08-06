import java.io.*;
class Sequence{
    public static void main(String[] args) throws IOException{
        FileInputStream fis1=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file8.txt");
        FileInputStream fis2=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file9.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        int a;
        while((a=sis.read())!=-1){
            System.out.print((char)a);
        }
        sis.close();
        fis2.close();
        fis1.close();
    }
}