import java.util.*;
class Shopping{
    public static void main(String[] args){
        ArrayList<Integer> prices=new ArrayList<>();
        prices.add(150);
        prices.add(100);
        prices.add(650);
        prices.add(70);
        int total=0;
        for(int i=0;i<prices.size();i++){
            total+=prices.get(i);
        }
        System.out.println("Total Before Discount : "+total);
        if(total>500){
            total-=50;
        }
        System.out.println("Discount Applied total : "+total);
    }
}