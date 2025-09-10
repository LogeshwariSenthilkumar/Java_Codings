interface Two3{
    void show3(int a,int b);
}
class InterfaceWithAnonymous2{
    public static void main(String[] args) {
        Two3 t3=new Two3() {
            @Override
            public void show3(int a, int b) {
                System.out.println(a+b);
            }
        };
        t3.show3(20,20);
    }
}