class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private int balance;
    BankAccount(int accountNumber,String accountHolder,int balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public int getAccNo(){
        return accountNumber;
    }
    public String getAccHolder(){
        return accountHolder;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int balance){
        this.balance+=balance;
    }
    public void withDraw(int balance){
        this.balance-=balance;
    }
}
class BankAccountSecurity{
    public static void main(String[] args){
        BankAccount b1=new BankAccount(1234,"Logu",50000);
        System.out.println("Bank Details:");
        System.out.println("Account No:"+b1.getAccNo());
        System.out.println("Account Holder:"+b1.getAccHolder());
        System.out.println("Balance:"+b1.getBalance());
        b1.deposit(15000);
        System.out.println("\nBalance after Depositing:"+b1.getBalance());
        b1.withDraw(1000);
         System.out.println("\nBalance after WithDrawing:"+b1.getBalance());

    }
}