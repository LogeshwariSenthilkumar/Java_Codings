import java.util.Random;
import java.util.function.Supplier;

class Student{
    String name="Logu";
}
class Supplier1 {
    public static void main(String[] args) {
        Supplier<String> printmsg=()->"Hi";
        System.out.println(printmsg.get());
        Supplier<Integer> randomNumber=()->new Random().nextInt(100);
        System.out.println(randomNumber.get());
        Supplier<Student> names=()->new Student();
        System.out.println(names.get().name);

    }
}
