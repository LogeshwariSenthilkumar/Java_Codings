class Shape{
    void draw(){
        System.out.println("Drawing...");
    }
}
class Rectangle extends Shape{
    void rectangle(){
         System.out.println("Rectangle...");
    }
}
class Square extends Rectangle{
    void square(){
         System.out.println("Square...");
    }
}
class Demo{
    public static void main(String[] args){
        Square ob=new Square();
         System.out.println("Square Class:");
        ob.draw();
        ob.rectangle();
        ob.square();
    }
}
