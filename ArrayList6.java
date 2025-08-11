import java.util.*;
class Reverse{
    public static void main(String[] args){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(20);
        nums.add(40);
        nums.add(10);
        nums.add(45);
        System.out.println("Original Order : "+nums);
        ArrayList<Integer> reverse=new ArrayList<>();
        for(int i=nums.size()-1;i>=0;i--){
           reverse.add(nums.get(i));
        }
        System.out.println("Reverse Order : "+reverse);
    }
}