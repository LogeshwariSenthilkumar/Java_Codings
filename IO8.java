import java.io.*;
class ImageCopierNew{
    public static void main(String[] args) throws IOException{
        // without Buffer;
        FileInputStream fis1=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Pictures\\Screenshots\\i.jpg");
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\image1.jpg");
        long start1 = System.currentTimeMillis();
        FileOutputStream fous1=new FileOutputStream(f1);
        int a;
        while((a=fis1.read())!=-1){
            fous1.write((char)a);
        }
        fis1.close();
        fous1.close();
        long end1 = System.currentTimeMillis();
        System.out.println("Time without buffering: " + (end1 - start1) + " ms");
        
        //With Buffer:
        FileInputStream fis2 = new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Pictures\\Screenshots\\i.jpg");
        BufferedInputStream bis1=new BufferedInputStream(fis2);
        File f2=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\image2.jpg");
        long start2 = System.currentTimeMillis();
        FileOutputStream fous2=new FileOutputStream(f2);
        BufferedOutputStream bous1=new BufferedOutputStream(fous2);
        int b;
        while((b=bis1.read())!=-1){
            bous1.write((char)b);
        }
        bis1.close();
        fis2.close();
        bous1.close();
        fous2.close();
        long end2 = System.currentTimeMillis();
        System.out.println("Time with buffering: " + (end2 - start2) + " ms");
    }
  
}