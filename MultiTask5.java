class Device{
    void device(){
        System.out.println("Device...");
    }
}
class Mobile extends Device{
    void mobile(){
         System.out.println("Mobile...");
    }
}
class SmartPhone extends Mobile{
    void smartPhone(){
         System.out.println("SmartPhone...");
    }
}
class Demo{
    public static void main(String[] args){
        SmartPhone ob=new SmartPhone();
         System.out.println("SmartPhone Class:");
        ob.device();
        ob.mobile();
        ob.smartPhone();
    }
}
