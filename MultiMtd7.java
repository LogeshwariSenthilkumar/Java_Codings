//yield;
class MultiThread12 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Child Thread1 - "+i);
        }
    }}
    class MultiThread13 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
             try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Child Thread2 - "+i);
            Thread.yield();
        }
    }
    public static void main(String[] args) throws InterruptedException{
       
        MultiThread12 t1=new MultiThread12();
         MultiThread13 t2=new MultiThread13();
        t1.start();
        t2.start();
        }
    }
