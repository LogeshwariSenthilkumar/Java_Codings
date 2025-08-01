class Printer{
    public synchronized void print(String doc){
        for(int i=1;i<=3;i++){
            System.out.println("Printing page - "+i+" of "+doc);
        }
            }
}
class User extends Thread{
    Printer ob;
    String doc;
    User(Printer ob,String doc){
        this.ob=ob;
        this.doc=doc;
    }
    public void run(){
        ob.print(doc);
    }
}
class Main{
    public static void main(String[] args){
      Printer p1=new Printer();
      User u1=new User(p1,"Resume.pdf");
      u1.start();
      User u2=new User(p1,"Report.pdf");
      u2.start();
    }
}