interface One2{
    void show1(int a);
}
class InterfaceWithNormal1 implements One2{
    public void show1(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        InterfaceWithNormal1 i=new InterfaceWithNormal1();
        i.show1(10);
    }
}