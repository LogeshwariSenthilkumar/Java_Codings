@FunctionalInterface
interface One{
    void show(int a);
}

class Demo{
    public static void main(String[] args){
      One o=(q)->System.out.println("Interface One");
      o.show(10);
      Runnable r=()->{
        for(int i=0;i<5;i++){
            System.out.println("Run");
        }
      };
      Thread t=new Thread(r);
      t.start();
    }
}
