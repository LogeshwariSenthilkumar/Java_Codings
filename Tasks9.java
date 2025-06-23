import java.util.Scanner;
class Animal{
    void sound(){
        System.out.println("Sounds!!!");
    }

}
class Dog{
     void sound(){
        System.out.println("Barks!!!");
    }

}
class Cat{
     void sound(){
        System.out.println("Meowww!!!");
    }

}
class Cow{
     void sound(){
        System.out.println("Maaaaa!!!");
    }

}
class Demo9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String type;
        do{
          System.out.println("Enter Animal Type or Exit");
          type=sc.nextLine();
          if(type.equals("Dog")){
            Dog d1=new Dog();
            d1.sound();
          }
          else if(type.equals("Cat")){
            Cat c1=new Cat();
            c1.sound();
          }
          else if(type.equals("Cow")){
            Cow c2=new Cow();
            c2.sound();
          }
          else if(type.equals("Exit")){
            type="Exit";
          }
          else{
            System.out.println("Invalid Animal Type!!!");
          }
        }while(!type.equals("Exit"));

    }
}