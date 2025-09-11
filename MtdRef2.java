import java.util.function.Function;

class MethodReference2 {
    public static void main(String[] args) {
        Function<String,String> toupper=String::toUpperCase;
        System.out.println(toupper.apply("Logeshwari Senthilkumar"));
    }
}
