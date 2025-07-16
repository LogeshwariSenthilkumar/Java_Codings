abstract class EventHandling{
    abstract void logindetails();
}
class Demo{
    public static void main(String[] args){
        EventHandling e=new EventHandling(){
            void logindetails(){
                String isbutton="clicked";
                if(isbutton.equals("clicked")){
                    System.out.println("Login Successful");
                }
                else{
                    System.out.println("Login Unsuccessful");
                }
            }
        };
        e.logindetails();
    }
}