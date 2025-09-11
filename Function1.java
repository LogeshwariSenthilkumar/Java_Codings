import java.util.function.BiFunction;
import java.util.function.Function;

class Function1 {
     public static void main(String[] args) {
         Function<Integer,Integer> doubles=(n)->n+n;
         System.out.println(doubles.apply(10));
         Function<String,Integer> len=(n)->n.length();
         System.out.println(len.apply("Logeshwari"));
     }
}