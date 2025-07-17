class Bank{
    void account_details(){
        String acc_name="Logu";
        int acc_no=12342;
        System.out.println("Account Name : "+acc_name);
        System.out.println("Account Number : "+acc_no);
    }
    void performTransaction(){
        class Transaction{
            double balance=50000;
            void deposit(int amount){
                System.out.println("Deposit Successfully...");
                balance+=amount;
                System.out.println("Balance After Deposit : "+balance);
            }
            void withdrawal(int amount){
                System.out.println("WithDrawn Successfully...");
                balance-=amount;
                System.out.println("Balance After Withdrawal : "+balance);
            }
        }
        Transaction t=new Transaction();
        t.deposit(10000);
        t.withdrawal(20000);
    }
}
class Main{
    public static void main(String[] args){
        Bank b=new Bank();
        b.account_details();
        b.performTransaction();
        
    }
}