class MultiThread extends Thread{
    public void run(){
        System.out.println("New Thread");
    }
    public static void main(String[] args){
        MultiThread m1=new MultiThread();
        m1.start();
        System.out.println("Main Thread");
    }
}