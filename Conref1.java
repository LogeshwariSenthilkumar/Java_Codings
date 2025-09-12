@FunctionalInterface
interface Eight{
    void show();
}
class Demos3{
    Demos3(){
        System.out.println("Constructor");
    }
}
class ConstructorReference1 {
    public static void main(String[] args) {
        Eight e=Demos3::new;
        e.show();
    }
}
