interface Three4{
    void show3(int a,int b);
}
class InterfaceWithLambda1{
    public static void main(String[] args) {
        Three4 t3=(a,b)->System.out.println(a+b);
        t3.show3(50,50);
    }
}