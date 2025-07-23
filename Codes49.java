class Multithread extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("Run Method");
        //   try{
        //     sleep(2000);
        //   }
        //   catch(InterruptedException e){

        //   }
            
        }
    }
}
class Multithread2 implements Runnable{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("Runnable Method");
        }
    }
}
class Main{
    public static void main(String[] args) throws InterruptedException{
        Multithread m=new Multithread();
        Multithread2 m2=new Multithread2();
        Thread t=new Thread(m2);
        m.start();
        // System.out.println(m.getState());
        // System.out.println(m.isAlive());
        // t.start();
        // for(int i=0;i<=2;i++){
        //     System.out.println("Main Method");
        // }
    }
}