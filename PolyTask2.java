class Animal{
    void makeSound(){
        System.out.println("Making Sound...");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow...");
    }
}
class Cow extends Animal{
    void makeSound(){
        System.out.println("Maaaaa...");
    }
}
class Demo{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
        Cow co=new Cow();
        co.makeSound();

    }
}