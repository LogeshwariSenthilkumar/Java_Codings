//sleep;
class MultiThread7 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Child Thread - "+i);
        }
    }
    public static void main(String[] args){
        MultiThread7 t1=new MultiThread7();
        t1.start();
          for(int i=1;i<=5;i++){
               try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Main Thread - "+i);
        }
    }
}