class Shape{
    void draw(){
        System.out.println("Drawing...");
    }
    void draw(int r){
        System.out.println("Drawing circle with area:"+(3.14*r*r));
    }
    void circle(int r){
         System.out.println("Drawing circle with area:"+(3.14*r*r));
    }
}
class Circle extends Shape{
    void circle(int r){
        double pi=3.14;
        System.out.println("Overriding Area:"+(pi*r*r));
    }
}
class Main{
    public static void main(String[] args)
    {
        Shape sp=new Shape();
        System.out.println("OverLoading.....");
        sp.draw();
        sp.draw(14);
        System.out.println("\nOverRiding.....");
        Circle c=new Circle();
        c.circle(10);
        c.circle(20);

    }
}