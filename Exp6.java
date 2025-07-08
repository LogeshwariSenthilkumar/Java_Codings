class Expcls6{
    public static void main(String[] args){
        System.out.println("Welcome");
        try{
           int c=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        
        System.out.println("End of the Program");
    }
}