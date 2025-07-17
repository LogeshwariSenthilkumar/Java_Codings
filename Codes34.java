import java.util.Scanner;
interface Offer{
    void getDiscount(double amount);
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bill Amount");
        double bill_amount=sc.nextDouble();
        Offer o=new Offer(){
            public void getDiscount(double amount){
                double discount=0;
                if(amount%500==0){
                  discount=amount*(0.10);
                }
                amount-=discount;
                System.out.println("Final Price is : "+amount);
            }

        };
        o.getDiscount(bill_amount);
    }
}