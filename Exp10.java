class ValueExtendedException extends Exception{
    ValueExtendedException(){
        super();
    }
    ValueExtendedException(String s){
        super(s);
    }
}
class Expcls10{
    int a=10;
    int b;
    void add(int num) throws ValueExtendedException{
        if(num<10){
            System.out.println("Not Successfully Divided!!!");
            throw new ValueExtendedException("Value Not Valid!!!");
        }
        else{
            System.out.println(a/num);
            System.out.println("Successfully Divided!!!");
        }
    }
    public static void main(String[] args) throws ValueExtendedException{
        Expcls10 ob=new Expcls10();
        ob.add(10);
        ob.add(9);

    }
}