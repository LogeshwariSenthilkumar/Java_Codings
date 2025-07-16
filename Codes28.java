class House{
    String name="Villa";
    private int no=20;
    private String address="Chennai";
    private class Room{
      int no_of_rooms=4;
      String type="Ac";
      void displayRoomDetails(){
         System.out.println("House No : "+no);
        System.out.println("House Address : "+address);
        System.out.println("No of Rooms : "+no_of_rooms);
        System.out.println("Room type : "+type);
      }
    }
    void displayDetails(){
        Room ob=new Room();
        System.out.println("House Name : "+name);
        ob.displayRoomDetails();
    }
}
class Main{
    public static void main(String[] args){
        House h=new House();
        h.displayDetails();
    }
}