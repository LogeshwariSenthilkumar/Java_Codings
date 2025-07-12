import java.util.Scanner;
class OverBookingException extends RuntimeException{
    OverBookingException(String s){
        super(s);
    }
}
class UserLimitExceededException extends RuntimeException{
    UserLimitExceededException(String s){
        super(s);
    }
}
class TicketBooking{
    int total=50;
    int limit=10;
    void seatcheck(int seat){
        if(seat>limit){
            throw new UserLimitExceededException("User Limit Exceeded");
        }
    }
    void totalseatcheck(int count){
        if(count>total){
            throw new OverBookingException("Over Booking");
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         TicketBooking t1=new TicketBooking();
        System.out.println("Enter the Numbers of Users:");
        int no_of_users=sc.nextInt();
        int count=0;
        for(int i=0;i<no_of_users;i++){
           System.out.println("Enter the Numbers of Seats:");
        int no_of_seats=sc.nextInt();
        t1.seatcheck(no_of_seats);
        count+=no_of_seats;
        }
          t1.totalseatcheck(count);
          System.out.println("Total seats Booked: "+count);
        
        
    }
}