class Typing extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Typing Line No : "+i);
        }
    }
}
class Saving extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Saving Line No : "+i);
        }
    }
}
class Documents{
    public static void main(String[] args) throws InterruptedException{
        Typing t1=new Typing();
         Saving s1=new Saving();
        t1.start();
        s1.start();
        t1.join();
        s1.join();
    }
}