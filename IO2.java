import java.io.*;
class B{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file2.txt");
        FileOutputStream fous1=new FileOutputStream(f1);
        BufferedOutputStream bous1=new BufferedOutputStream(fous1);
        String s1="Logeshwari Senthilkumar";
        byte[] b=s1.getBytes();
        bous1.write(b);
        bous1.close();
        FileInputStream fis1=new FileInputStream(f1);
        BufferedInputStream bis1=new BufferedInputStream(fis1);
        int a;
        while((a=bis1.read())!=-1){
            System.out.print((char)a);
        }
        bis1.close();
            }
}