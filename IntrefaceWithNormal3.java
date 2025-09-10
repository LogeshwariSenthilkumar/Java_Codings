interface One3{
    void show2(int a,int b);
}
class InterfaceWithNoraml2 implements One3{
    public void show2(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        InterfaceWithNoraml2 i2=new InterfaceWithNoraml2();
        i2.show2(10,10);
    }
}