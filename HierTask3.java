class Vehicle{
    void drive(){
        System.out.println("Driving...");
    }
}
class Bike extends Vehicle{
    void driveBike(){
         System.out.println("Driving Bike...");
    }
}
class Truck extends Vehicle{
    void loadTruck(){
         System.out.println("Loading Truck...");
    }
}
class Demo{
    public static void main(String[] args){
        Bike ob1=new Bike();
         System.out.println("Bike Class:");
        ob1.drive();
        ob1.driveBike();
        Truck ob2=new Truck();
         System.out.println("\nTruck Class:");
        ob2.drive();
        ob2.loadTruck();
    }
}
