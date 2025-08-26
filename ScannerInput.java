import java.util.*;
class Demo2{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five Number : ");
        for(int i=0;i<5;i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
    }
}