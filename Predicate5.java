import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

//String Validation:
class Predicate5{
    public static void main(String[] args) {
        Predicate<String> startswith=(n)->(n.startsWith("Admin"));
        Predicate<String> len=(n)->(n.length()>5);
        Predicate<String> stringvalidate=(startswith).and(len);
        System.out.println(stringvalidate.test("Logeshwari"));
        System.out.println(stringvalidate.test("Admin1"));
    }
}
