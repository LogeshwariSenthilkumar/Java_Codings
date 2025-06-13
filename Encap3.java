class MovieTicket{
    private String movieName;
    private int seatNumber;
    private int price;
    int flag=0;
    MovieTicket(String movieName,int seatNumber,int price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public int getPrice(){
        return price;
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber=seatNumber;
        this.flag=1;
    }
}
class MovieTicketBooking{
    public static void main(String[] args){
        MovieTicket m1=new MovieTicket("Tourist Family",3,250);
        System.out.println("Movie Booking Details:");
        System.out.println("Name:"+m1.getMovieName());
        System.out.println("SeatNumber:"+m1.getSeatNumber());
        System.out.println("Price:"+m1.getPrice());
        m1.setSeatNumber(5);
        System.out.println("SeatNumber After Changing:"+m1.getSeatNumber());
        m1.setSeatNumber(10);
        if(m1.flag>=1){
            System.out.println("SeatNumber can be Changed only once....");
        }


    }
}