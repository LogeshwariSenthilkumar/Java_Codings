import java.io.*;
class StudentReportMerger{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file8.txt");
        File f2=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file9.txt");
        File f3=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file10.txt");
        File f4=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file11.txt");
        FileOutputStream fous1=new FileOutputStream(f1);
        String s1="Student - 1\nName : Logeshwari Senthilkumar\nID : 55\nDOB : 25/06/2003\nGrade : O\n";
        byte[] b1=s1.getBytes();
        fous1.write(b1);
        fous1.close();
        FileOutputStream fous2=new FileOutputStream(f2);
        String s2="\nStudent - 2\nName : Janani \nID : 304\nDOB : 27/08/2004\nGrade : A\n";
        byte[] b2=s2.getBytes();
        fous2.write(b2);
        fous2.close();
         FileOutputStream fous3=new FileOutputStream(f3);
        String s3="\nStudent - 3\nName : Dhivya Dharshini\nID : 55\nDOB : 08/08/2003\nGrade : B\n";
        byte[] b3=s3.getBytes();
        fous3.write(b3);
        fous3.close();
        FileInputStream fis1=new FileInputStream(f1);
        int a;
        String s11="";
        while((a=fis1.read())!=-1){
            s11+=(char)a;
        }
        FileInputStream fis2=new FileInputStream(f2);
        int b;
        String s22="";
        while((b=fis2.read())!=-1){
            s22+=(char)b;
        }
        FileInputStream fis3=new FileInputStream(f3);
        int c;
        String s33="";
        while((c=fis3.read())!=-1){
            s33+=(char)c;
        }
        FileOutputStream fous4=new FileOutputStream(f4);
        BufferedOutputStream bous4=new BufferedOutputStream(fous4);
        byte[] b4=s11.getBytes();
        byte[] b5=s22.getBytes();
        byte[] b6=s33.getBytes();
        bous4.write(b4);
        bous4.write(b5);
        bous4.write(b6);
        bous4.close();
        fous4.close();
        System.out.println("Successfully Mergered!!!");
    }
}