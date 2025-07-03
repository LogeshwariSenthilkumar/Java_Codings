class Demo{
    int a=10;
    public Demo object(){
        return this;
    }
    public static void main(String[] args){
        Demo ob=new Demo();
        Demo ob1=ob.object();
        System.out.println(ob1.a);
    }
}