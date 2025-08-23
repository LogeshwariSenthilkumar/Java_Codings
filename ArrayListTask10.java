import java.util.*;
class Task10{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(11);
        al.add(54);
        al.add(79);
        al.add(24);
        al.add(89);
        System.out.println("Before Sorting : "+al);
         Collections.sort(al, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
        System.out.println("After Sorting : "+al);
    }
}