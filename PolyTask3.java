class AreaCalculator{
    void calculateArea(int r){
        System.out.println("Cirle Area:"+(3.14*r*r));
    }
    void calculateArea(int length ,int width){
        System.out.println("Rectangle Area:"+(length*width));
    }
    void calculateArea(double base,double heigth){
        System.out.println("Triangle Area:"+0.5*base*heigth);
    }
}
class Demo{
    public static void main(String[] args)
    {
        AreaCalculator c=new AreaCalculator();
        c.calculateArea(10);
        c.calculateArea(10,20);
        c.calculateArea(19.3,5.6);

    }
}