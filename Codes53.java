class TrainTicketBooking{
    int ticket_count=4;
     synchronized void booking(String name,int req_tickets){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
         System.out.println(".... Welcome to the Ticket Booking .... ");
        if(ticket_count>=req_tickets){
          ticket_count-=req_tickets;
        System.out.println("SUCCESSFULL !!!");
        System.out.println("Tickets has by Booked by "+name);
        System.out.println("Remaining ticket Counts : "+ticket_count);
        }
        else{
            System.out.println("Insufficient Tickets...");
        }
        System.out.println("=====================================================================");
        
    }
}
class User extends Thread{
    String name;
    int req_tickets;
    TrainTicketBooking ob;
    User(TrainTicketBooking ob,String name,int req_tickets){
     this.ob=ob;
     this.name=name;
     this.req_tickets=req_tickets;
    }
    public void run(){
     ob.booking(name,req_tickets);
    }
}
class Main{
    public static void main(String[] args){
        TrainTicketBooking t=new TrainTicketBooking();
        User u1=new User(t,"Logu",2);
        u1.start();
        User u2=new User(t,"Dhivya",2);
        u2.start();
        User u3=new User(t,"Janu",2);
        u3.start();
    }
}