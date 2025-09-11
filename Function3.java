import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

//StudentGradeMapping:
class Student1{
    int id;
    String name;
    int marks;
    Student1(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
        }
class Function4 {
    public static void main(String[] args) {
        ArrayList<Student1> al=new ArrayList<>();
        al.add(new Student1(101,"Logu",95));
        al.add(new Student1(102,"Janu",78));
        al.add(new Student1(103,"Chitra",65));
        al.add(new Student1(104,"Barani",89));
        Function<Integer, String> mark = (m) -> {
            if (m <= 100 && m >= 90) {
                return "A";
            } else if (m < 90 && m >= 80) {
                return "B";
            } else if (m < 80 && m >= 70) {
                return "C";
            } else if (m < 70 && m >= 60) {
                return "D";
            } else {
                return "Fail";
            }
        };

        for(Student1 s:al){
           System.out.println(s.id+" "+s.name+" "+s.marks+" "+mark.apply(s.marks)+" ");
        }
    }
}
