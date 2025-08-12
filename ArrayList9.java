import java.util.*;
import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ArrayList<String> al=new ArrayList<>();
        al.add("Logu");
        al.add("Dhivya");
        al.add("Janu");
        al.add("Aishu");
        al.add("Barani");
        
        FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file17.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fous);
        oos.writeObject(al);
        oos.close();
        fous.close();
        System.out.println("Success!!!");

        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file17.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList al2=(ArrayList)ois.readObject();
        System.out.println(al2);
    }
}