import java.util.Scanner;
class Account{
    private String name;
    private double balance;
    private int accountNo;
    Account(String name,double balance,int accountNo){
        this.name=name;
        this.balance=balance;
        this.accountNo=accountNo;
    }
    public String getName(){
        return name;
    }
    public double getbalance(){
        return balance;
    }
    public int getaccountNo(){
        return accountNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAccountNo(int accountNo){
        this.accountNo=accountNo;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            this.balance-=amount;
            System.out.println("AFTER WITHDRAW BALANCE:"+balance);
        }
        else{
            System.out.println("INSUFFICIENT AMOUNT!!!");
        }
    }

}
class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account a1=new Account("Logeshwari",50000,1234);
        System.out.println("Name:"+a1.getName());
        System.out.println("Balance:"+a1.getbalance());
        System.out.println("Accno:"+a1.getaccountNo());
        System.out.println("Enter the Amount for WithDraw:");
        double amount=sc.nextDouble();
        a1.withdraw(amount);

    }
}