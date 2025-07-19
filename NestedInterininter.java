interface One{
    void show();
    interface Two{
        void show1();
    }
}
class Three implements One.Two{
    public void show1(){
        System.out.println("Interface Two Show1 method");
    }
    public static void main(String[] args){
        Three t=new Three();
        t.show1();
    }
}