import java.io.*;
class A{
    public static void main(String[] args) throws IOException{
        FileOutputStream fous1=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file14.txt");
        FileOutputStream fous2=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file15.txt");
        ByteArrayOutputStream bous=new ByteArrayOutputStream();
        bous.write(97);
        bous.writeTo(fous1);
        bous.writeTo(fous2);
        bous.close();
        fous2.close();
        fous1.close();
        System.out.println("Success");

        }
}