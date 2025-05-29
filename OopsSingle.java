//Single:
class Father{
    void fatherProperty(){
        System.out.println("Father Property");
    }

}
class Son extends Father{
    void sonProperty(){
        System.out.println("Son Property");
    }

}
class Demo1{
    public static void main(String[] args){
        Son s=new Son();
        s.fatherProperty();
        s.sonProperty();

    }
}