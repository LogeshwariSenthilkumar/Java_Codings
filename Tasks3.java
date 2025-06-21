import java.util.Scanner;
abstract class Bank{
    abstract void getRateOfInterest(double s,double pi,double tt);
}
class SBI
{
    public void getRateOfInterest(double si,double p,double t){
        double r1=(si*100)/(p*t);
        System.out.println("Rate Of Interest for SBI Bank:"+r1);

    }
}
class HDFC{
    public void getRateOfInterest(double si,double p,double t){
        double r2=(si*100)/(p*t);
        System.out.println("Rate Of Interest for HDFC Bank:"+r2);

    }
}
class Demo3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Times You want Rate of Interest for Different Bank:");
        int t=sc.nextInt();
        sc.nextLine();
        int i=1;
        while(i<=t){
            System.out.println("\nEnter the BankName SBI or HDFC:");
            String name=sc.nextLine();
            if(name.equals("SBI")){
                SBI s1=new SBI();
                System.out.println("Enter Simple Interest:");
                double sii=sc.nextDouble();
                System.out.println("Enter Principal Amount:");
                double pii=sc.nextDouble();
                 System.out.println("Enter Years/Months:");
                double ttt=sc.nextDouble();
                s1.getRateOfInterest(sii,pii,ttt);
                sc.nextLine();
            }
            else if(name.equals("HDFC")){
               HDFC h1=new HDFC();
               System.out.println("Enter Simple Interest:");
                double si2=sc.nextDouble();
                System.out.println("Enter Principal Amount:");
                double p2=sc.nextDouble();
                 System.out.println("Enter Years/Months:");
                double t2=sc.nextDouble();
                h1.getRateOfInterest(si2,p2,t2);
                sc.nextLine();
            }
            i++;
        }

    }
}