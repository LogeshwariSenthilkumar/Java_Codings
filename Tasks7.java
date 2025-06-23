class Engine{
    String engineName;
    String type;
    Engine(String engineName,String type){
        this.engineName=engineName;
        this.type=type;
    }
    String engineName(){
        return engineName;
    }
    String engineType(){
        return type;
    }
}
class Car{
    String name;
    int price;
    Engine ob1;
    Car(String name,int price,String engineName,String engineType){
        this.name=name;
        this.price=price;
        this.ob1=new Engine(engineName,engineType);
    }
    void displayCarDetails(){
        System.out.println("CAR DETAILS:");
        System.out.println("Car Name:"+name+"\n"+"Price:"+price+"\n"+"Engine:"+ob1.engineName()+"\n"+"Engine Type:"+ob1.engineType());
    }
}
class Demo7{
    public static void main(String[] args){
        Car c1=new Car("BMW",1000000,"4-stroke","Diesel");
        c1.displayCarDetails();
    }
}