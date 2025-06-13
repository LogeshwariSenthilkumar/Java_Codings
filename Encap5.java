import java.util.Scanner;
class Thermostat{
    private int temperature;
    private String mode;
    private String status;
    Thermostat(int temperature,String mode,String status){
        this.temperature=temperature;
        this.mode=mode;
        this.status=status;
    }
    public int getTemperature(){
        return temperature;
    }
    public String getMode(){
        return mode;
    }
    public String getStatus(){
        return status;
    }
    public void setIncreTemperature(int temperature){
        this.temperature+=temperature;
    }
    public void setDecreTemperature(int temperature){
        this.temperature-=temperature;
    }
}
class SmartThermostatController{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Thermostat t1=new Thermostat(16,"Cool","ON");
        System.out.println("Initial Temperature:"+t1.getTemperature());
        if(t1.getTemperature()<=16){
            System.out.println("Enter the Temperature to Increase:");
            int count=sc.nextInt();
            t1.setIncreTemperature(count);
            System.out.println("After Increase Temperature:"+t1.getTemperature());
        }
        if(t1.getTemperature()>=30){
             System.out.println("Temperature Cannot be Changed....");
              System.out.println("Enter the Temperature to Decrease:");
            int count=sc.nextInt();
             t1.setDecreTemperature(count);
             System.out.println("After Decrease Temperature:"+t1.getTemperature());
        }

    }
}