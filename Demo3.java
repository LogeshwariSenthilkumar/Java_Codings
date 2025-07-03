class A{
    int a=20;
    public static void main(String[] args){
        A ob1=new A();
        A ob2=new A();
        if(ob1.equals(ob2)){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
}