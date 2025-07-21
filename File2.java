import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java");
        f1.mkdir();
        File f2=new File("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\File1.txt");
        f2.createNewFile();
        FileWriter fw=new FileWriter(f2);
        fw.write("Logeshwari\n");
        fw.write("Dhivya Dharshini\n");
        fw.close();
        FileReader fr1=new FileReader(f2);
        int a;
        System.out.println("The Content in File1 is : ");
        while((a=fr1.read())!=-1){
            char ch=(char)a;
            System.out.print(ch);
        }

        System.out.println("Success");
    }
}