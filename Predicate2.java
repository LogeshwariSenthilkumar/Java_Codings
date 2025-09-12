import java.util.function.BiPredicate;
class Predicate2{
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isEven=(n1, n2)->((n1+n2)%2==0);
        System.out.println(isEven.test(10,10));
        System.out.println(isEven.test(20,5));
    }
}