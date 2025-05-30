class LivingThing{
    void breathe(){
        System.out.println("Breathing...");
    }
}
class Animal extends LivingThing{
    void walk(){
         System.out.println("Walking...");
    }
}
class Dog extends Animal{
    void bark(){
         System.out.println("Barking...");
    }
}
class Demo{
    public static void main(String[] args){
        Dog ob=new Dog();
         System.out.println("Dog Class:");
        ob.breathe();
        ob.walk();
        ob.bark();
    }
}
