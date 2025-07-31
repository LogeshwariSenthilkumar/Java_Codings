//getPriority,setPriority
class MultiThread6 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread - "+i);
        }
    }
    public static void main(String[] args){
        MultiThread6 t1=new MultiThread6();
        t1.start();
          for(int i=1;i<=5;i++){
            System.out.println("Main Thread - "+i);
        }
        t1.setPriority(10);
        Thread.currentThread().setPriority(6);
        System.out.println(t1.getPriority());
        System.out.println(Thread.currentThread().getPriority());
    }
}