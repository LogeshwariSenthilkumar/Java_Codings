class Shape{
    void draw(){
        System.out.println("Drawing...");
    }
}
class Circle extends Shape{
    void calculateAreaCircle(){
        int r=5;
         System.out.println("Area:"+(3.15*r*r));
    }
}
class Triangle extends Shape{
    void calculateAreaTriangle(){
        int b=20;
        int h=10;
         System.out.println("Area:"+(0.5*b*h));
    }
}
class Demo{
    public static void main(String[] args){
        Circle ob1=new Circle();
         System.out.println("Circle Class:");
        ob1.draw();
        ob1.calculateAreaCircle();
        Triangle ob2=new Triangle();
         System.out.println("\nTriangle Class:");
        ob2.draw();
        ob2.calculateAreaTriangle();
    }
}
