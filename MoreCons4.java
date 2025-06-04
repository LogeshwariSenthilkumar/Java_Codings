//Constructor in Has A Relationship:
class Demo{
    String name="Logeshwari";
    int id=55;
}
class Sample{
    Demo ob;
    Sample(Demo ob){ //Copy Constructor
        this.ob=ob;
        System.out.println(ob.name+" "+ob.id);
    }
}
class Main{
    public static void main(String[] args){
        Demo d= new Demo();
        Sample sc=new Sample(d);

    }
}