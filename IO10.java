import java.io.*;
class Student implements Serializable{
    String name;
    int id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
}
class Main{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Student s1=new Student("Logeshwari",55);
        FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file12.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fous);
        oos.writeObject(s1);
        oos.close();
        fous.close();
        System.out.println("Success!!!");

        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file12.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s11=(Student)ois.readObject();
        System.out.println(s11.id+" "+s11.name);
    }
}