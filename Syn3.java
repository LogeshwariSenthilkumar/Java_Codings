class Logger{
    public static synchronized void writeLog(String name){
        for(int i=1;i<=5;i++){
            System.out.println("Writing Log of "+name+" of Page - "+i);
        }
    }
}
class User extends Thread{
    Logger ob;
    String name;
    User(Logger ob,String name){
        this.ob=ob;
        this.name=name;
    }
    public void run(){
        ob.writeLog(name);
    }
}
class Main{
    public static void main(String[] args){
        Logger l1=new Logger();
        Logger l2=new Logger();
        new User(l1,"Doc - 1").start();
        new User(l2,"Doc - 2").start();
    }
}