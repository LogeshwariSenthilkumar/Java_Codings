class B{
    String name;
    int age;
    B(String name1,int age1){
        name=name1;
        age=age1;
        System.out.println("Class B Constructor Called");
    }
    public static void main(String[] args)
    {
        B ob=new B("Logu",21);
        B ob1=new B("Janu",20);
        B ob2=new B("DD",21);
        B ob3=new B("Barani",20);
        System.out.println(ob.name+" "+ob.age);
        System.out.println(ob1.name+" "+ob1.age);
        System.out.println(ob2.name+" "+ob2.age);
        System.out.println(ob3.name+" "+ob3.age);
      
    }
}