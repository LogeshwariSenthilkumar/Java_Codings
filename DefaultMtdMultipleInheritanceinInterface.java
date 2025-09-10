//Default:
interface Six1{
    default public void show2(){
        System.out.println("Show Method of Interface six1");
    }
}
interface Six2{
    default public void show2(){
        System.out.println("Show Method of interface six2");
    }
}
class Demo implements Six1,Six2{
    public void show2(){
        Six1.super.show2();
        Six2.super.show2();
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.show2();
    }
}