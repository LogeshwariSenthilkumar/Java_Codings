class Shape{
    void draw(){
        System.out.println("Drawing..");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle...");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square...");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle...");
    }
}
class Demo{
    public static void main(String[] args)
    {
        Circle c=new Circle();
        c.draw();
        Square s=new Square();
        s.draw();
        Triangle t=new Triangle();
        t.draw();

    }
}