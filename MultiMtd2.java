//setName,getName
class MultiThread5 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread - "+i);
        }
    }
    public static void main(String[] args){
        MultiThread5 t1=new MultiThread5();
        t1.start();
          for(int i=1;i<=5;i++){
            System.out.println("Main Thread - "+i);
        }
        t1.setName("THREAD - 1");
        Thread.currentThread().setName("MAIN THREAD");
        System.out.println(t1.getName());
        System.out.println(Thread.currentThread().getName());
    }
}