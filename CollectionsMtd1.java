import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
        Collections.swap(al,0,4);
        System.out.println(al);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
        Collections.reverse(al);
        System.out.println(al);
        Collections.fill(al,10);
        System.out.println(al);
        System.out.println(Collections.frequency(al,10));
        System.out.println(al);
        Collections.replaceAll(al,10,100);
        System.out.println(al);
        List<Integer> al2=Arrays.asList(1,2,3,4,5,6);
        Collections.copy(al2,al);
        System.out.println(al2);
        

    }
}