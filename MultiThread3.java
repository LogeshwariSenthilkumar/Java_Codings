class MultiThread3 implements Runnable {
    public void run(){
        System.out.println("Child Thread");
    }
    public static void main(String[] args){
        MultiThread3 t1=new MultiThread3();
        Thread t=new Thread(t1);
        t.start();
        System.out.println("Main Thread");
    }
}