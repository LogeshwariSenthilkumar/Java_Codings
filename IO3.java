import java.io.*;
import java.util.Scanner;
class SecretDiary{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int key=3;
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file3.txt");
        FileOutputStream fous1=new FileOutputStream(f1);
        BufferedOutputStream bous1=new BufferedOutputStream(fous1);
        System.out.println("Enter the Message : ");
        String s1=sc.nextLine();
        byte[] b=s1.getBytes();
        for(int i=0;i<b.length;i++){
            b[i]+=key;
        }
        bous1.write(b);
        bous1.close();
        System.out.println("The Original Message is : ");
        FileInputStream fis1=new FileInputStream(f1);
        BufferedInputStream bis1=new BufferedInputStream(fis1);
        int a;
        while((a=bis1.read())!=-1){
            a-=key;
            System.out.print((char)a);
        }
        bis1.close();
        fis1.close();

    }
}