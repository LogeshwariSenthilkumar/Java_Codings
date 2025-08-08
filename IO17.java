// package Practice;
import java.io.*;
class Person implements Serializable{
	String name;
	int id;
	Person(String name,int id){
		this.name=name;
		this.id=id;
	}
}
class Student extends Person{
	String dept;
	int fees;
	Student(String name,int id,String dept,int fees){
		super(name,id);
		this.dept=dept;
		this.fees=fees;
		
	}
}
 class I {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Student s1=new Student("Logu",55,"CSE",15000);
		Student s2=new Student("Dhivya",21,"CSE",50000);
		FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file8.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fous);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.close();
		fous.close();
		System.out.println("Success");

        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Documents\\Java\\New folder\\file8.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student[] s11={
            (Student)ois.readObject(),
            (Student)ois.readObject()
        };
        for(Student s:s11){
            System.out.println(s.id+" "+s.name+" "+s.dept+" "+s.fees);
        }
        ois.close();
        fis.close();

	}

}
