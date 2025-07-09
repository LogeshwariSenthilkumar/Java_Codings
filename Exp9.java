class Expcls9{
    public static void main(String[] args){
        System.out.println("Welcome");
        try{
            int a=10/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Completed!!");
        }
        
        System.out.println("Hello");
    }
}