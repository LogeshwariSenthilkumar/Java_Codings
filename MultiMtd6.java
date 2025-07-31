//isalive,getstate;
class MultiThread10 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
          System.out.println("Child Thread1 - "+i);
        }
    }}
    class MultiThread11 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread2 - "+i);
        }
    }
    public static void main(String[] args) throws InterruptedException{
       
        MultiThread10 t1=new MultiThread10();
         MultiThread11 t2=new MultiThread11();
        System.out.println(t1.getState());
        t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        }
    }
