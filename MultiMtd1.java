//Active Count:
class MultiThread4 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread - "+i);
        }
    }
    public static void main(String[] args){
        MultiThread4 t1=new MultiThread4();
        t1.start();
          for(int i=1;i<=5;i++){
            System.out.println("Main Thread - "+i);
        }
        System.out.println("Thread Count : "+Thread.activeCount());
    }
}