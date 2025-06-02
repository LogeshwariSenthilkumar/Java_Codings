class Vehicle{
    void start(){
        System.out.println("Starting...");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike is Starting...");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is Starting...");
    }
}
class Truck extends Vehicle{
    void start(){
        System.out.println("Truck is Starting...");
    }
}
class Demo{
    public static void main(String[] args)
    {
         Bike b=new Bike();
        b.start();
        Car c=new Car();
        c.start();
        Truck t=new Truck();
        t.start();

    }
}