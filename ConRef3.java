import java.util.function.BiFunction;
import java.util.function.Supplier;

class Student{
    int id;
    String name;

}
class ContructorRef1 {
    public static void main(String[] args) {
        Supplier<Student> ss=Student::new;
        System.out.println(ss.get());
    }
}