import java.io.*;
class C{
    public static void main(String[] args) throws IOException{
        FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file14.txt");
        DataOutputStream dos=new DataOutputStream(fous);
        dos.write(65);
        dos.close();
        fous.close();
        System.out.println("Success");
    }
}