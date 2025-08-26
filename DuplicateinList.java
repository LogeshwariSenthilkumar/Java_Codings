import java.util.*;
class Demo3{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(29);
        al.add(56);
        al.add(45);
        al.add(43);
        al.add(67);
        al.add(29);
        System.out.println(al);
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i).equals(al.get(i+1))){
                al.remove(i+1);
                i--;
            }
        }
        System.out.println(al);

       
    }
}