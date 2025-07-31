//join;
class MultiThread8 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Child Thread1 - "+i);
        }
    }}
    class MultiThread9 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread2 - "+i);
        }
    }
    public static void main(String[] args) throws InterruptedException{
       
        MultiThread8 t1=new MultiThread8();
         MultiThread9 t2=new MultiThread9();
        t1.start();
        t1.join(1000);
        t2.start();
        }
    }
