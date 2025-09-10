interface Two2{
    void show1(int a);
}
class InterfaceWithAnonymous1{
    public static void main(String[] args) {
        Two2 t2=new Two2() {
            public void show1(int a) {
                System.out.println(a);
            }
        };
        t2.show1(20);
    }
}