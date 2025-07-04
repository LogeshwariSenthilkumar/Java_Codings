class ExpCls{
    public static void main(String[] args){
        System.out.println("Hi");
        try{
            int a=10/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Closing..");
        }
        System.out.println("Welcome");
    }
}