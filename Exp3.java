class LimitedReachedException extends Exception{
    LimitedReachedException(){
        super();
    }
    LimitedReachedException(String s){
        super(s);
    }
}
class Expcls2{
    int balance=10000;
    int limit=5000;
    void withDraw(int amount) throws LimitedReachedException
    {
        if(amount>limit){
            System.out.println("Not Successfull!!!");
            throw new LimitedReachedException("Limit Reached");
            
        }
        else{
            System.out.println("Successfull!!!");
        }
    }
    public static void main(String[] args) throws LimitedReachedException{
        Expcls2 ep=new Expcls2();
        ep.withDraw(6000);

    }
}