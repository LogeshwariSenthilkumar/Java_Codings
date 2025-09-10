@FunctionalInterface
interface Four1{
    void show();
}
class FunctionalInterface1 {
    public static void main(String[] args) {
        Four1 f=()->System.out.println("Show Method");
        f.show();
    }
}