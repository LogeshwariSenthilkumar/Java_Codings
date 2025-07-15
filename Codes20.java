import java.io.File;
class Demo{
    public static void main(String[] args){
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\Folder1");
        f1.mkdir();
        File f2=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\Folder1\\Folder2\\Folder3");
        f2.mkdirs();
    }
}