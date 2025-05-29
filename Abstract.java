abstract class Bank{
   abstract void loan();
   abstract void account();
   void atm(){
    System.out.println("Give ATM");
   }
}
class Home extends Bank{
void loan(){
    System.out.println("Home Loan");
}
void account(){
    System.out.println("Saving Account");
}
}
class Education extends Bank{
    void loan(){
        System.out.println("Educational Loan");
    }
    void account(){
        System.out.println("Salary Account");
    }

}
class Demo{
    public static void main(String[] args){
        Home ob=new Home();
        ob.loan();
        ob.atm();
        ob.account();
        Education ob2=new Education();
        ob2.loan();
        ob2.atm();
        ob2.account();

    }
}