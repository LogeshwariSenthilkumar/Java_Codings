import java.util.Scanner;
interface TaxCalculator{
    double taxCalculator(double amount);
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TaxCalculator t=new TaxCalculator(){
            public double taxCalculator(double amount){
                double tax=amount*(0.18);
                return tax;
            }
        };
        System.out.println("Enter the Amount :");
        double amount=sc.nextDouble();
        System.out.println("The Tax Amount is : "+t.taxCalculator(amount));
    }
}