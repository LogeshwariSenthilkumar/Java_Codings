interface Two1{
    void show();
}
class InterfaceWithAnonymous{
    public static void main(String[] args) {
        Two1 t1=new Two1() {
            public void show() {
                System.out.println("Show Method");
            }
        };
        t1.show();
    }
}