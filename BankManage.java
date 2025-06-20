class Account{
    String type;
    double balance;
    Account(String type,double balance){
        this.type=type;
        this.balance=balance;
    }
    void deposit(double amount){
        this.balance+=amount;
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        
    }
    void showBalance(){
        System.out.println(type+" Balance Amount:"+balance);
    }
}
class Customer{
    String name;
    Account saving,current;
    Customer(String name){
        this.name=name;
        saving=new Account("Saving",10000);
        current=new Account("Current",20000);
    }
    void transferAmount(String from,double amount){
        if(from.equals("Saving")){
            saving.withdraw(amount);
            current.deposit(amount);
        }
        else{
            current.withdraw(amount);
            saving.deposit(amount);
        }
    }
    void showCustomerDetails(){
        System.out.println("Name:"+name);
        saving.showBalance();
        current.showBalance();
    }
}
class Bank{
    public static void main(String[] args){
        Customer c1=new Customer("Logeshwari");
        c1.showCustomerDetails();
        c1.transferAmount("Saving",1000);
        System.out.println("After Transfer:");
        c1.showCustomerDetails();

    }
}