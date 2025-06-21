class Person{
    String name;
    int id;
    String address;
    Person(String name,int id,String address){
        this.name=name;
        this.id=id;
        this.address=address;
    }
    void displayDetails(){
        System.out.println("\nStudent Details:");
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Address:"+address);
    }

}
class Student extends Person{
    Student(String name,int id,String address){
        super(name,id,address);
    }
}
class Demo{
    public static void main(String[] args){
        Student s1=new Student("Logeshwari",55,"Pothanur");
        s1.displayDetails();
        Student s2=new Student("Janani",304,"Thattanchavadi");
        s2.displayDetails();
    }
}