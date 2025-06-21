import java.util.Scanner;
class Shape{
    void areaCalculator(double a,double b){
        System.out.println("Area Calculator for different Shapes!!!");

    }
}
class Circle extends Shape{
    void areaCalculator(double r,double p){
        System.out.println("AREA OF CIRCLE:"+(p*r*r));
    }

}
class Rectangle extends Shape{
    void areaCalculator(double length,double breadth)
    {
        System.out.println("AREA OF RECTANGLE:"+(length*breadth));
    }
}
class Demo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Times You want Areacalculator for Different Shapes:");
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            System.out.println("\nEnter the Shape Circle or Rectangle:");
            String shape=sc.nextLine();
            if(shape.equals("Circle")){
                Circle c1=new Circle();
                System.out.println("Enter Radius:");
                double rad=sc.nextDouble();
                c1.areaCalculator(rad,3.14);
                sc.nextLine();
            }
            else if(shape.equals("Rectangle")){
                Rectangle r1=new Rectangle();
                System.out.println("Enter Length and Breadth:");
                double len=sc.nextDouble();
                double bre=sc.nextDouble();
                r1.areaCalculator(len,bre);
                sc.nextLine();
            }
        }
    }
}
