class Games extends Thread{
    public void run(){
        while(true){
         System.out.println("Auto-Saving Game ....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        }    
    }
}
class Player{
    public static void main(String[] args){
        Games g=new Games();
        g.setDaemon(true);
        g.start();
        System.out.println("<< Player Playing >>");
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Exiting the Game ....");
       
    }
}