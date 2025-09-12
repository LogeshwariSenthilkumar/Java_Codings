@FunctionalInterface
interface Eight1{
    void show(int a);
}
class Demos4{
    Demos4(int a){
        System.out.println(a+" Contructors");
    }
}
class Constructor1{
    public static void main(String[] args) {
        Eight1 e=Demos4::new;
        e.show(10);
    }
}