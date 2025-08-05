import java.io.*;
import java.util.Scanner;
class ChatLogger{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        String[] msgs=new String[3];
        String msg1="Hello\n";
        String msg2="Hi\n";
        String msg3="World\n";
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file7.txt");
        FileOutputStream fous1=new FileOutputStream(f1);
         for(int i=0;i<msgs.length;i++){
            System.out.println("Enter the Message "+(i+1)+" : ");
            msgs[i]=sc.nextLine()+"\n";
            byte[] b=msgs[i].getBytes();
            fous1.write(b);
            
        }
            fous1.close();
        System.out.println("Messages saved Successfully!!!\n");

        FileInputStream fis1=new FileInputStream(f1);
        BufferedInputStream bis1=new BufferedInputStream(fis1);
        int a;
        System.out.println("---- Chat Log ----");
        while((a=bis1.read())!=-1){
            System.out.print((char)a);
        }
        bis1.close();
        fis1.close();

       

    }
}