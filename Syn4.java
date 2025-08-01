class SharedData{
    synchronized void synchronizedMethod(String name){
        for(int i=1;i<=2;i++){
            System.out.println("Sharing message of line - "+i+" of "+name);
        }
    }
    void synchronizedBlock(String name){
        // System.out.println("Sending Datas ...");
        synchronized(this){
            for(int i=0;i<=2;i++){
                System.out.println("Sending -"+i+" of "+name);
            }
        }
    }
}
class User extends Thread{
  SharedData ob;
  String name;
  User(SharedData ob,String name){
    this.ob=ob;
    this.name=name;
  }
   public void run(){
    ob.synchronizedMethod(name);
     ob.synchronizedBlock(name);
   }
}
class Main{
    public static void main(String[] args){
        SharedData s1=new SharedData();
        new User(s1,"User-1").start();
        new User(s1,"User-2").start();
    }
}