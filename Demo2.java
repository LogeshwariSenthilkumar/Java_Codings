class A{
    int a=20;
    public A object(){
        return new A();
    }
    public static void main(String[] args){
        A ob1=new A();
        A ob2=ob1.object();
        System.out.println(ob2.a);
    }
}