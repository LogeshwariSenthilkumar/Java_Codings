class One{
    interface Two{
        void show();
    }
}
class Three implements One.Two{
    public void show(){
        System.out.println("Interface two show method");
    }
    public static void main(String[] args){
        Three t=new Three();
        t.show();
    }
}