class Account{
    private String userName;
    private int pass;
    Account(String username1,int pass1){
        userName=username1;
        pass=pass1;
    }
    public String getName()
    {
        return userName;
    }
    public int getPass()
    {
        return pass;
    }
    public String setName(String username2)
    {
        userName=username2;
        return userName;
    }
    public int setPass(int pass2){
        pass=pass2;
        return pass;
    }
    public static void main(String[] args)
    {
        Account ac=new Account("Logeshwari",1234);
       System.out.println("Name:"+ ac.getName());
        System.out.println("Pass:"+ac.getPass());
  
       
        System.out.println("Name:"+ ac.setName("Janani"));
        System.out.println("Pass:"+ ac.setPass(5678));
    }
}