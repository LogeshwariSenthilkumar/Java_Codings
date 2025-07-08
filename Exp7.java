class Expcls7
{
    public static void main(String[] args){
        System.out.println("Welcome");
        try{
        //    int c[]={1,2,3};
        //    System.out.println(c[10]);
              int c=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("End of the Program");
    }
}