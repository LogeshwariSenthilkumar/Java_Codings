import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(65);
        al.add(89);
        al.add(87);
        al.add(45);
        al.add(80);
        System.out.println(al);

        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<al.size();i++){
            if(al.get(i)%2==0){
                even.add(al.get(i));
            }
            else{
                odd.add(al.get(i));
            }
        }
        System.out.println("ODD LIST : "+odd);
        System.out.println("EVEN LIST : "+even);

    }
}