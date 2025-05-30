class Vehicle{
    void startEngine(){
        System.out.println("Engine Started...");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Driving Car....");
    }
}
class Demo{
    public static void main(String[] args){
        Car ob= new Car();
        System.out.println("Car Class:");
        ob.startEngine();
        ob.drive();
    }
}