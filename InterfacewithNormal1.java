interface One1{
    void show();
}
class InterfacewithNormal implements One1{
    public void show() {
        System.out.println("Show Method");
    }

    public static void main(String[] args) {
        InterfacewithNormal i=new InterfacewithNormal();
        i.show();
    }
}