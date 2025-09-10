interface Three1{
    void show1();
}
class InterfaceWithLamba {
    public static void main(String[] args) {
        Three1 t=()->System.out.println("Show Method");
        t.show1();
    }
}