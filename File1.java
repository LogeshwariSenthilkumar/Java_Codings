import java.io.File;
class Demo{
    public static void main(String[] args){
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\Fold1");
        f1.mkdir();
        File f2=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\Fold1\\Fold2\\Fold3");
        f2.mkdirs();
        System.out.println("Success...");
    }
}