class Singletoncls{
  private static Singletoncls instance;
  private Singletoncls(){
   
  }
  public static Singletoncls getInstance(){
    if(instance==null){
       instance=new Singletoncls();
    }
     return instance;
  }
}
class Demo{
    public static void main(String[] args){
        System.out.println(Singletoncls.getInstance());
         System.out.println(Singletoncls.getInstance());
         System.out.println(Singletoncls.getInstance());
    }
}