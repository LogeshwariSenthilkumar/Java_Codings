import java.util.*;
class Contact{
    public static void main(String[] args){
        HashMap<Long,String> contact =new HashMap<>();
        contact.put(7380931960l,"Logu");
        contact.put(6373883777l,"Chitra");
        contact.put(8842407659l,"Senthil");
        contact.put(8345679033l,"Dhivya");
        contact.put(8344552900l,"Sanjay");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PhoneNo : ");
        long phoneNo=sc.nextLong();
        if(contact.containsKey(phoneNo)){
            System.out.println("Name : "+contact.get(phoneNo));
        }
        else{
            System.out.println("Not Found!!!");
        }

    }
}