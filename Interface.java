interface Account{
    void account();
}
interface Trans{
    void pay();
    void send();
}
class Gpay implements Trans,Account{
    public void pay(){
        System.out.println("Paying with Gpay");
    }
    public void send(){
        System.out.println("Sending with Gpay");
    }
     public void account(){
        System.out.println("Salary Account");
    }

}
class Phonepay implements Trans,Account{
    public void pay(){
        System.out.println("Paying with Phonepay");
    }
     public void send(){
        System.out.println("Sending with Phonepay");
    }
     public void account(){
        System.out.println("Saving Account");
    }
    

}
class Demo{
    public static void main(String[] args){
       Gpay g=new Gpay();
       g.pay();
       g.send();
       g.account();
       Phonepay p=new Phonepay();
       p.pay();
       p.send();
       p.account();
    }
}