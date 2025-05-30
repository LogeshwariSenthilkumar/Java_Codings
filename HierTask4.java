class Animal{
    void makeSound(){
        System.out.println("Making Sound...");
    }
}
class Cat extends Animal{
    void cat(){
         System.out.println("Meow...");
    }
}
class Cow extends Animal{
    void cow(){
         System.out.println("Moooooooo..");
    }
}
class Sheep extends Animal{
    void sheep(){
         System.out.println("Baaaaa...");
    }
}

class Demo{
    public static void main(String[] args){
        Cat ob1=new Cat();
         System.out.println("Cat Class:");
        ob1.makeSound();
        ob1.cat();
        Cow ob2=new Cow();
         System.out.println("\nCow Class:");
        ob2.makeSound();
        ob2.cow();
        Sheep ob3=new Sheep();
         System.out.println("\nSheep Class:");
        ob3.makeSound();
        ob3.sheep();

    }
}
