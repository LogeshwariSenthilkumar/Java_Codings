import java.util.*;
class StudentMarksTracker{
    public static void main(String[] args){
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(45);
        marks.add(97);
        marks.add(90);
        marks.add(35);
        marks.add(87);
        System.out.println(marks);
        int min=marks.get(0);
        int max=marks.get(0);
        int sum=0;
        for(int i=0;i<marks.size();i++){
            if(min>marks.get(i)){
                min=marks.get(i);
            }
            if(max<marks.get(i)){
                max=marks.get(i);
            }
            sum+=marks.get(i);
        }
        System.out.println("Highest : "+max);
        System.out.println("Lowest : "+min);
        System.out.println("Average : "+sum/marks.size());
        
        

    }
}