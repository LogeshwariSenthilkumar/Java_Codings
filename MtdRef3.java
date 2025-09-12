@FunctionalInterface
interface Seven{
    void show();
}
class Demos{
    public static void main(String[] args) {
        Seven s=()->System.out.println("Show Method");
        s.show();
    }
}
@FunctionalInterface
interface Seven1{
    void show();
}
class Demos1{
    void play(){
        System.out.println("Playing");
    }
}
class Method{
    public static void main(String[] args) {
        Demos1 d=new Demos1();
        Seven1 s=d::play;
        s.show();
    }
}

@FunctionalInterface
interface Seven3{
    void show();
}
class Demos2{
    static void play(){
        System.out.println("Static Method");
    }
}
class Method1{
    public static void main(String[] args) {
        Seven3 s=Demos2::play;
        s.show();
    }
}