import java.io.*;
class A{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file1.txt");
        //Writing the file:
        FileOutputStream fous1=new FileOutputStream(f1);
        // fous1.write(65);
        // fous1.close();
        String s1="Logeshwari Senthilkumar";
        byte[] b=s1.getBytes();
        fous1.write(b);
        fous1.close();
        System.out.println("Success!!!");

        //Reading the file:
        FileInputStream fis1=new FileInputStream(f1);
        int a;
        while((a=fis1.read())!=-1){
            System.out.print((char)a);
        }
        fis1.close();


    }
}