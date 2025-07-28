class MultiThread2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("New Thread "+i);
        }
    }
    public static void main(String[] args){
        MultiThread2 m1=new MultiThread2();
        m1.start();
         for(int i=0;i<5;i++){
            System.out.println("Main Thread "+i);
        }
    }
}