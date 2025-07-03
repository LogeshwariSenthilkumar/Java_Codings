class Exp{
    public static void main(String[] args){
        System.out.println("Hello");
        try{
           String s="hello";
           System.out.println(s.charAt(0));
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Closing...");
        }
        
        System.out.println("Welcome");
    }
}