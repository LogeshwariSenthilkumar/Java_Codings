class Counter{
    void increment(String name){
        System.out.println(Thread.currentThread().getName()+" is Executing....");
        synchronized(this){
            for(int i=1;i<=5;i++){
                System.out.println(name+" Value of Increment : "+i);
            }
        }
    }
}
class User extends Thread{
    Counter ob;
    String name;
    User(Counter ob,String name){
        this.ob=ob;
        this.name=name;
    }
    public void run(){
        ob.increment(name);
    }
}
class Main{
    public static void main(String[] args){
        Counter c1=new Counter();
        new User(c1,"User-1").start();
        new User(c1,"User-2").start();
    }
}