class Address{
    String address(){
        return "Pothanur";
    }
}
class Person{
    String name;
    long phoneNo;
    Address ob;
    Person(String name,long phoneNo,Address ob)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.ob=ob;
    }
    void personalDetails(){
        System.out.println(name+" "+phoneNo+" "+ob.address());

    }
}
class Demo1{
    public static void main(String[] args){
        Address a=new Address();
        Person p=new Person("LogeshwariSenthilkumar",7683456543l,a);
        p.personalDetails();
    }
}