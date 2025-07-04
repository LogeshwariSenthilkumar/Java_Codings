class A{
    int a=10;
}
class B{
    int b=20;
}
class Demo{
    public static void main(String[] args){
        A ob1=new A();
        A ob2=new A();
        B ob11=new B();
        if(ob1 instanceof A){
            System.out.println("A");
        }
        if(ob2 instanceof A){
            System.out.println("A");
        }
        if(ob11 instanceof B){
            System.out.println("B");
        }
        

    }
}