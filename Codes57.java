class Games extends Thread{
    public void run(){
        int i=1;
        while(true){
         System.out.println("Gaming Tip - "+i+" .....");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        i++;
        }    
    }
}
class Main{
    public static void main(String[] args){
        Games g=new Games();
        g.setDaemon(true);
        g.start();
        System.out.println("<< Game Loading >>");
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Exiting the Game ....");
       
    }
}