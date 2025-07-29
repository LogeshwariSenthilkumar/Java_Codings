class Announcement1 extends Thread{
    public void run(){
        try{
           Thread.sleep(2500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Platform No : 1 Train No : 75A Starts at : 9.30 A.M");
    }
}
class Announcement2 extends Thread{
    public void run(){
        try{
           Thread.sleep(3500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Platform No : 2 Train No : 95A Starts at : 10.30 A.M");
    }
}
class Announcement3 extends Thread{
    public void run(){
        try{
           Thread.sleep(1500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Platform No : 3 Train No : 105A Starts at : 12.30 P.M");

    }
}
class TrainStation{
    public static void main(String[] args){
        Announcement1 a1=new Announcement1();
        Announcement2 a2=new Announcement2();
        Announcement3 a3=new Announcement3();
        a1.start();
        a2.start();
        a3.start();
    }
}