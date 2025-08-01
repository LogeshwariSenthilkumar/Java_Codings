class DemoSyn{
    public synchronized void instanceMethod(String name){
        System.out.println(name+" Instance Method");
      
    }
    public static synchronized void staticMethod(String name){
        System.out.println(name+" Static Method");

    }
}
class User extends Thread{
    DemoSyn ob;
    String name;
    User(DemoSyn ob,String name){
        this.ob=ob;
        this.name=name;
    }
    public void run(){
        ob.instanceMethod(name);
        ob.staticMethod(name);
    }
}
class Main{
    public static void main(String[] args){
        DemoSyn d1=new DemoSyn();
        new User(d1,"User-1").start();
        new User(d1,"User-2").start();
    }
}