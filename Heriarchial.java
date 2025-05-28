class Shape{
    public void draw(){
        System.out.println("Drawing!!!");
    }
}
class Circle extends Shape{
    public void circle(){
        System.out.println("Circle....");
        draw();
    }
}
class Triangle extends Shape{
    public void triangle(){
        System.out.println("Triangle...");
        draw();
    }
}
class Heriarchial{
    public static void main(String[] args)
    {
        Circle ob= new Circle();
        ob.circle();
        Triangle obj=new Triangle();
        obj.triangle();

    }
}