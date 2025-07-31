class ATM{
    int balance=0;
    synchronized void withDraw(String name,int amount){
    while(balance<amount){
        try{
            System.out.println("waiting ....");
          wait();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    balance-=amount;
    System.out.println("Amount "+amount+" Successfully Withdrawn by "+name);
    System.out.println("Remaining Balance : "+balance);
    }
    synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("Amount "+amount+" Deposited Successfully");
        System.out.println("Available Balance : "+balance);
        notifyAll();
    }
}
class Customer extends Thread{
    ATM ob;
    String name;
    int amount;
    Customer(ATM ob,String name,int amount){
        this.ob=ob;
        this.name=name;
        this.amount=amount;
    }
    public void run(){
        ob.withDraw(name,amount);
    }
}
class Bank extends Thread{
    ATM ob;
    int amount;
    Bank(ATM ob,int amount){
        this.ob=ob;
        this.amount=amount;
    }
    public void run(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        ob.deposit(amount);
    }
}
class BankATM{
    public static void main(String[] args){
     ATM atm=new ATM();
     new Customer(atm,"Logu",2000).start();
     new Customer(atm,"Janu",3000).start();
     new Customer(atm,"Bara",4000).start();
     new Bank(atm,15000).start();
    }
}