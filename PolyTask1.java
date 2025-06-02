class Calculator{
    int add(int a,int b){
        System.out.println(a+b);
        return 0;
    }
    double add(double a,double b){
        System.out.println(a+b);
        return 0;
    }
    int add(int a,int b,int c){
        System.out.println(a+b+c);
        return 0;
    }
}
class Demo{
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        c.add(10,10);
        c.add(19.5,2.5);
        c.add(10,20,30);

    }
}