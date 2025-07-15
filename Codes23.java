class Demo3{
    int a;
    int b=10;
    void show(int a){
     show1(this.b);
     this.a=a;
     System.out.print(a);
    }
    void show1(int c){
        System.out.println(c);
    }
    public static void main(String[] args){
        Demo3 d=new Demo3();
        d.show(20);

    }
}