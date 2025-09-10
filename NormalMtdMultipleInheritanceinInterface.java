interface Five{
    void show();
}
interface Five1{
    void show();
}
class InterfacewithMultipleInheritance implements Five,Five1{
    @Override
    public void show() {
        System.out.println("Show Methods");
    }
    public static void main(String[] args) {
        InterfacewithMultipleInheritance i=new InterfacewithMultipleInheritance();
        i.show();
    }
}