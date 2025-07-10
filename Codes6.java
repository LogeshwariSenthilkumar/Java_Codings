import java.util.Scanner;
class LimitReachedException extends RuntimeException{
    LimitReachedException(String s){
    super(s);
    }
}
class InsufficientAmountException extends RuntimeException{
      InsufficientAmountException(String s){
        super(s);
      }

}
class DepositLimitReachedException extends RuntimeException{
    DepositLimitReachedException(String s){
        super(s);
    }

}
class Atm{
    int balance=50000;
    int deposit_limit=20000;
    int withdraw_limit=10000;
    void withdraw(int amount){
        if(amount>balance){
            System.out.println("Unsuccessfull...");
            throw new InsufficientAmountException("INSUFFICIENT BALANCE!!!");
        }
        else if(amount>withdraw_limit){
            System.out.println("UnSuccessfull...");
            throw new LimitReachedException("WITHDRAW AMOUNT LIMIT REACHED!!!");
            
        }
      
        else{
            System.out.println("Successfull...");
            balance-=amount;
             System.out.println("Balance after WithDrawal : "+balance);
        }
    }
    void deposit(int amount){
        if(amount>deposit_limit){
            System.out.println("Unsuccessfull...");
            throw new DepositLimitReachedException("DEPOSIT AMOUNT REACHED!!!");
        }
        else{
            System.out.println("Successfull...");
            balance+=amount;
            System.out.println("Balance After Deposit : "+balance);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Atm p1=new Atm();
        System.out.println("Enter the amount for Withdraw:");
        int amount_withdraw=sc.nextInt();
        p1.withdraw(amount_withdraw);
         System.out.println("Enter the amount for Deposit:");
         int amount_deposit=sc.nextInt();
         p1.deposit(amount_deposit);

    }
}