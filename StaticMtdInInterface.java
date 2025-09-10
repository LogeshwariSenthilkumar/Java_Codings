//static method:
interface Four3{
    static void show2(){
        System.out.println("Static show Method of interface");
    }
}
class Demo2{
    public static void main(String[] args) {
        Four3.show2();
    }
}