class Student{
    String name;
    Address obj;
    Student(String name,Address obj){
        this.name=name;
        this.obj=obj;
    }
    void display(){
        System.out.println(name+"-"+obj.no+" "+obj.street+" "+obj.city);
    }
}
class Address{
    int no;
    String street;
    String city;
    Address(int no,String street,String city)
    {
        this.no=no;
        this.street=street;
        this.city=city;
    }
}
class Demo{
    public static void main(String[] args){
        Student sc=new Student("Logeshwari",new Address(78,"East Street","Pothanur"));
        sc.display();
        Student sc2=new Student("Janani",new Address(131,"West Street","Thattanchavadi"));
        sc2.display();

    }
}