class LimitedReachedException extends RuntimeException{
    LimitedReachedException(){
        super();
    }
    LimitedReachedException(String s){
        super(s);
    }
}
class ExpCls3{
    int balance=10000;
    int limit=5000;
    void withDraw(int amount){
        if(amount>limit){
            System.out.println("UnSuccessfull...");
            throw new LimitedReachedException("Limit Reached...");
        }
        else{
            System.out.println("Successfull...");
        }
    }
    public static void main(String[] args){
        ExpCls3 ep3=new ExpCls3();
        ep3.withDraw(6000);
        
    }
}