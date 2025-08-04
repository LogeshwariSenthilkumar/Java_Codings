class Race{
    void racing(String name,int delay,String place){
        System.out.println(name+" Starting....");
        try{
          Thread.sleep(delay);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name+" Finishing.... at "+place);
    }
}
class Car extends Thread{
    String name;
    Race ob;
    int delay;
    String place;
    Car(Race ob,String name,int delay,String place){
        this.ob=ob;
        this.name=name;
        this.delay=delay;
        this.place=place;
    }
    public void run(){
        ob.racing(name,delay,place);
    }
}
class Main{
    public static void main(String[] args){
        Race r=new Race();
        new Car(r,"Car - 1",3000,"4th").start();
        new Car(r,"Car - 2",2000,"3rd").start();
        new Car(r,"Car - 3",1000,"1st").start();
        new Car(r,"Car - 4",4000,"5th").start();
        new Car(r,"Car - 5",1500,"2nd").start();

    }
}