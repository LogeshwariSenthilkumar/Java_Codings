import java.io.*;
class ReverseFileReader{
    public static void main(String[] args) throws IOException{
        FileInputStream fis1=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file5.txt");
        int a;
        String s1="";
        String rev="";
        while((a=fis1.read())!=-1){
            s1+=(char)a;
        }
        for(int i=s1.length()-1;i>=0;i--){
            rev+=s1.charAt(i);
        }
        fis1.close();
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file6.txt");
        FileOutputStream fous1=new FileOutputStream(f1);
        BufferedOutputStream bous=new BufferedOutputStream(fous1);
        byte[] b=rev.getBytes();
        bous.write(b);
        bous.close();
        fous1.close();
        System.out.println("Success!!!");
            }
}