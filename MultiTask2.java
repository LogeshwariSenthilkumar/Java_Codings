class Application{
    void turnOn(){
        System.out.println("Turning On...");
    }
}
class WashingMachine extends Application{
    void startWash(){
         System.out.println("Start Washing...");
    }
}
class SmartWasher extends WashingMachine{
    void connectToWifi(){
         System.out.println("Connecting Wifi...");
    }
}
class Demo{
    public static void main(String[] args){
        SmartWasher ob=new SmartWasher();
         System.out.println("SmartWasher Class:");
        ob.turnOn();
        ob.startWash();
        ob.connectToWifi();
    }
}
