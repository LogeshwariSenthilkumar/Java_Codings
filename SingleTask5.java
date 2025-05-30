class BankAccount{
    void deposit(){
        System.out.println("Depositing Amount....");
    }
}
class SavingAccount extends BankAccount{
    void addInterest()
    {
        System.out.println("Interest Added....");
    }
}
class Demo{
    public static void main(String[] args){
        SavingAccount ob= new SavingAccount();
        System.out.println("SavingAccount Class:");
        ob.deposit();
        ob.addInterest();
    }
}

