interface TaxCalculator{
    double taxCalculator(double amount);
}
class Main{
    public static void main(String[] args){
        TaxCalculator t=new TaxCalculator(){
            public double taxCalculator(double amount){
                double tax=amount*(0.18);
                return tax;
            }
        };
        System.out.println("The Tax Amount is : "+t.taxCalculator(200000));
    }
}