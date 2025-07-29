class Waiter1 extends Thread{
    public void run(){
        System.out.println("Waiter 1 for Table 1:");
        System.out.println("Chicken Noodles");
    }
}
class Waiter2 extends Thread{
    public void run(){
        System.out.println("Waiter 2 for Table 2:");
        System.out.println("Chicken Rice");
    }
}
class Waiter3 extends Thread{
    public void run(){
        System.out.println("Waiter 3 for Table 3:");
        System.out.println("Chicken Briyani");
    }
}
class Restaurant {
    public static void main(String[] args){
        Waiter1 w1=new Waiter1();
         w1.start();
        Waiter2 w2=new Waiter2();
        w2.start();
        Waiter3 w3=new Waiter3();
        w3.start();
    }
}