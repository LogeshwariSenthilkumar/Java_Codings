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
      Student s1=new Student("Logu",55);
      Student s2=new Student("Janu",304);
      FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file13.txt");
      ObjectOutputStream oos=new ObjectOutputStream(fous);
      oos.writeObject(s1);
      oos.writeObject(s2);
      oos.close();
      fous.close();
      System.out.println("Success");

      FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\file13.txt");
      ObjectInputStream ois=new ObjectInputStream(fis);
      Student[] ob={
        (Student)ois.readObject(),
        (Student)ois.readObject()
      };
      for(Student s:ob){
        System.out.println(s.id+" "+s.name);
      }
    }
}