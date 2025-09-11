import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
//Library:
class PredicateBiPre{
    public static void main(String[] args) {
        Predicate<String> name=(n)->(n.contains("Java"));
        BiPredicate<String,Integer> check=(n1,n2)->(name.test(n1) && (n2)>0);
        System.out.println(check.test("JavaBook",10));
        System.out.println(check.test("Java",0));
    }
}