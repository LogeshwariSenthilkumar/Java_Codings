interface One{
    class Two{
        void show(){
            System.out.println("Class Two Show Method");
        }
    }
}
class Three extends One.Two{
    public static void main(String[] args){
        Three t=new Three();
        t.show();
    }
}