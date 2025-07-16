class Car{
    String name="Ferrari";
    int price=500000;
    private int car_number=12;
    void displayCarDetails(){
        System.out.println("Car Name : "+name+"\n"+"Car Price : "+price);
    }
    class Engine{
        String engine_type="Petrol";
        void displayDetails(){
            displayCarDetails();
            System.out.println("Car Number : "+car_number);
            System.out.println("Engine Type : "+engine_type);
        }
    }
}
class Main{
    public static void main(String[] args){
        Car c1=new Car();
        Car.Engine e=c1.new Engine();
        e.displayDetails();
    }
}