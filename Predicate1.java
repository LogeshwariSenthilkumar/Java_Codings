import java.util.function.Predicate;

public class Predicate1{
    public static void main(String[] args) {
        Predicate<Integer> isEven =(n)->(n%2==0);
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(13));
        Predicate<Integer> iszero=(n)->n==0;
        System.out.println(iszero.test(0));
        System.out.println(iszero.test(10));

    }
}