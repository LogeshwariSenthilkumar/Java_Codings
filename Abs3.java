abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    abstract void connectToWifi(String networkName);
}
class SmartLight extends SmartDevice{
    void turnOn(){
         System.out.println("Turning ON SmartLight..");
    }
    void turnOff(){
         System.out.println("Turning OFF SmartLight..");
    }
    void connectToWifi(String networkName){
         System.out.println("NetWork Name:"+networkName);
    }

}
class SmartThermostat extends SmartDevice{
    void turnOn(){
         System.out.println("Turning ON SmartThermostat..");
    }
    void turnOff(){
         System.out.println("Turning OFF SmartThermostat..");
    }
    void connectToWifi(String networkName){
         System.out.println("NetWork Name:"+networkName);
    }

}
class SmartSpeaker extends SmartDevice{
    void turnOn(){
         System.out.println("Turning ON SmartSpeaker..");
    }
    void turnOff(){
         System.out.println("Turning OFF SmartSpeaker..");
    }
    void connectToWifi(String networkName){
         System.out.println("NetWork Name:"+networkName);
    }


}
class Demo{
    public static void main(String[] args){

      SmartLight ll=new SmartLight();
      System.out.println("SmartLight Class:");
      ll.turnOn();
      ll.turnOff();
      ll.connectToWifi("SSID");
     SmartThermostat th=new SmartThermostat();
     System.out.println("\nSmartThermostat Class:");
     th.turnOn();
     th.turnOff();
    th.connectToWifi("LAN");
    SmartSpeaker sp=new SmartSpeaker();
     System.out.println("\nSmartSpeaker Class:");
     sp.turnOn();
     sp.turnOff();
    sp.connectToWifi("WLAN");
    



    }
}