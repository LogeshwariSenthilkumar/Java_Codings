abstract class Vehicle{
    abstract void startEngine();
    abstract void calculateRentalCost(int hours);
    abstract void getFuelType();
}
class Car extends Vehicle{
     void startEngine(){
         System.out.println("Car Engine is Started..");
     }
     void calculateRentalCost(int hours){
        int amt=100;
        System.out.println("Rental Cost:"+(hours*amt));

     }
     void getFuelType(){
        System.out.println("Petrol");

     }

}
class Bike extends Vehicle{
     void startEngine(){
         System.out.println("Bike Engine is Started..");
     }
     void calculateRentalCost(int hours){
        int amt=50;
        System.out.println("Rental Cost:"+(hours*amt));

     }
     void getFuelType(){
        System.out.println("Petrol");

     }
    

}
class Truck extends Vehicle{
     void startEngine(){
         System.out.println("Truck Engine is Started..");
     }
     void calculateRentalCost(int hours){
        int amt=150;
        System.out.println("Rental Cost:"+(hours*amt));

     }
     void getFuelType(){
        System.out.println("Diesel");

     }
     

}
class Demo{
    public static void main(String[] args){

      Car cc=new Car();
      System.out.println("Car Class:");
      cc.startEngine();
      cc.calculateRentalCost(2);
      cc.getFuelType();
      Bike bb=new Bike();
      System.out.println("\nBike Class:");
      bb.startEngine();
      bb.calculateRentalCost(3);
      bb.getFuelType();
      Truck tt=new Truck();
      System.out.println("\nTruck Class:");
      tt.startEngine();
      tt.calculateRentalCost(4);
      tt.getFuelType();


    }
}