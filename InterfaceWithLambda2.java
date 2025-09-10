interface Three3{
    void show2(int a);
}
class InterfaceWithLambda{
    public static void main(String[] args) {
        Three3 t1=(a)->System.out.println(a);
        t1.show2(50);
    }
}