class Account{
    void atm(){
        System.out.println("Has ATM...");
    }
}
class CurrentAccount extends Account{
    void withDraw(){
         System.out.println("WithDrawing Amount...");
    }
}
class SavingAccount extends Account{
    void addInterest(){
         System.out.println("Interest Added...");
    }
}
class LoanAccount extends Account{
    void calculateEMI(){
         System.out.println("Calculating EMI...");
    }
}

class Demo{
    public static void main(String[] args){
        CurrentAccount ob1=new CurrentAccount();
         System.out.println("CurrentAccount Class:");
        ob1.atm();
        ob1.withDraw();
        SavingAccount ob2=new SavingAccount();
         System.out.println("\nSavingAccount Class:");
        ob2.atm();
        ob2.addInterest();
        LoanAccount ob3=new LoanAccount();
         System.out.println("\nLoanAccount Class:");
        ob3.atm();
        ob3.calculateEMI();

    }
}
