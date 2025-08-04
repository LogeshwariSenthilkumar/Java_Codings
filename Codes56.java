class ATM{
    int balance=10000;
     void withdraw(int amount,String name){
        synchronized(this){
            if(balance>=amount){
            balance-=amount;
            System.out.println("WithDraw Successful..... by "+name);
            System.out.println("Remaining Amount : "+balance);
        }
        else{
            System.out.println("Insufficient Balance!!!");
        }
        }

    }
}
class User extends Thread{
 ATM ob;
 String name;
 int amount;
 User(ATM ob,String name,int amount){
    this.ob=ob;
    this.name=name;
    this.amount=amount;
 }
 public void run(){
  ob.withdraw(amount,name);
 }
}
class Main{
    public static void main(String[] args){
        ATM atm=new ATM();
        new User(atm,"User -1",4000).start();
        new User(atm,"User -2",4000).start();
    }
}