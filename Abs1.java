abstract class PaymentGateway{
    abstract void validatePayment();
    abstract void processPayment();
    abstract void generateReceipt();
}
class CreditCardPayment extends PaymentGateway{
     void validatePayment(){
       System.out.println("Validate Payment for Credit Card");
     }
     void processPayment(){
        System.out.println("Process Payment of CreditCard");

     }
     void generateReceipt(){
        System.out.println("Receipt Generated for Creditcard");

     }

}
class UPIPayment extends PaymentGateway{
     void validatePayment(){
       System.out.println("Validate Payment for UPIPayment");
     }
     void processPayment(){
        System.out.println("Process Payment of UPIPayment");

     }
     void generateReceipt(){
        System.out.println("Receipt Generated for UPIPayment");

     }

}
class NetBankingPayment extends PaymentGateway{
     void validatePayment(){
       System.out.println("Validate Payment for NetBanking");
     }
     void processPayment(){
        System.out.println("Process Payment of NetBanking");

     }
     void generateReceipt(){
        System.out.println("Receipt Generated for NetBanking");

     }

}
class Demo{
    public static void main(String[] args){

      CreditCardPayment cc=new CreditCardPayment();
      System.out.println("CreditCardPayment Class:");
      cc.validatePayment();
      cc.processPayment();
      cc.generateReceipt();
      UPIPayment uu=new UPIPayment();
      System.out.println("\nUPIPayment Class:");
      uu.validatePayment();
      uu.processPayment();
      uu.generateReceipt();
      NetBankingPayment nn=new NetBankingPayment();
      System.out.println("\nNetBankingPayment Class:");
      nn.validatePayment();
      nn.processPayment();
      nn.generateReceipt();


    }
}