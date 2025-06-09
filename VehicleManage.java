import java.util.Scanner;
abstract class Vehicle{
    String name;
    double distance;
    double time;
    double speed;
    abstract void calculateSpeed();
    Vehicle(String name){
        this.name=name;
    }
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Distance:");
        distance=sc.nextDouble();
        System.out.println("Enter Time:");
        time=sc.nextDouble();     
    }
    void display(String name,double speed){
        System.out.println("Name:"+name);
        System.out.println("Speed:"+speed);
    }
}
class Car extends Vehicle{
    Car(String name){
        super(name);
    }
    void calculateSpeed(){
        input();
        speed=distance/time;
          System.out.println("-----------------------------------------------------------");
        System.out.println("CAR CLASS:");
        display(name,speed);
        if(speed>=110){
            System.out.println("Speed Limit is 110!!!");
        }
        else{
            System.out.println("Good to Go");
        }
         System.out.println("-----------------------------------------------------------");

    }
}
class Bike extends Vehicle{
    Bike(String name){
        super(name);
    }
    void calculateSpeed(){
        input();
        speed=distance/time;
         System.out.println("-----------------------------------------------------------");
        System.out.println("BIKE CLASS:");
        display(name,speed);
        if(speed>=80){
            System.out.println("Speed Limit is 80!!!");
        }
        else{
            System.out.println("Good to Go");
        }
         System.out.println("-----------------------------------------------------------");

    }
}
class Demo2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Whether Car or Bike?");
        String vehicle=sc.nextLine();
        if(vehicle.equals("Car")){
            System.out.println("Enter Car Name:");
            String name=sc.nextLine();
            Car c=new Car(name);
            c.calculateSpeed();
        }
        else if(vehicle.equals("Bike")){
            System.out.println("Enter Bike Name:");
            String name=sc.nextLine();
            Bike b=new Bike(name);
            b.calculateSpeed();
        }
    }
}