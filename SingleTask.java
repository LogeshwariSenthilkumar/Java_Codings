class Animal{
    void eat(){
         System.out.println("Eating....");
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
        ob.eat();
        ob.bark();
    }
}