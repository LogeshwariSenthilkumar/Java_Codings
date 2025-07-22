import java.io.*;
class UserInfo{
    public static void main(String[] args) throws IOException{
    FileReader fr=new FileReader("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\userinfo.txt");
    int b;
    while((b=fr.read())!=-1){
        char ch=(char)b;
        System.out.print(ch);
    }
    
    }
}