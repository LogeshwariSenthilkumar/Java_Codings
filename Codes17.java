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
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int total_seats=50;
         int count=0;
         int no_of_seats;
        while(count<50){
                try{
                     System.out.println("\nHi, Welcome to ticket Booking");
                    System.out.println("Enter the UserName:");
                    String name=sc.nextLine();
                    System.out.println("Enter the Numbers of Seats:"); 
                    no_of_seats=sc.nextInt();
                    sc.nextLine();
                    if(no_of_seats>10){
                     throw new UserLimitExceededException("User Limit Exceeded"); 
                    }
                    else{
                        count+=no_of_seats;
                        System.out.println("Successfully Booked");
                    }  
                    System.out.println("Total Seats Booked: "+count);
                 }catch(UserLimitExceededException e){
                System.out.println("User Limit Exceeded");
                   System.out.println("Seat number should be minimum 10");
                         System.out.println("Enter the Numbers of Seats:"); 
                         no_of_seats=sc.nextInt();
                         sc.nextLine();
                          System.out.println("Successfully Booked");
                          count+=no_of_seats;
                 }
                 }
                 try{
                      throw new OverBookingException("OverBooking");
                 }
                 catch(OverBookingException e){
                    System.out.println("All the Seats are Booked");
                 }

       
        
    }}
