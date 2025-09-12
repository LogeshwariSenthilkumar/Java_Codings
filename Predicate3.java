import java.util.function.Predicate;
class Predicate3{
    public static void main(String[] args) {
        Predicate<Integer> isEven=(n)->(n%2==0);
        Predicate<Integer> isGreaterThan10=(n)->n>0;
        Predicate<Integer> isEvenAndisGreaterthan10=isEven.and(isGreaterThan10);
        Predicate<Integer> isEvenOrisGreaterthan10=isEven.or(isGreaterThan10);
        System.out.println(isEvenAndisGreaterthan10.test(20));
        System.out.println(isEvenOrisGreaterthan10.test(20));
        System.out.println(isEvenAndisGreaterthan10.test(5));
        System.out.println(isEvenAndisGreaterthan10.test(15));
        System.out.println(isEvenOrisGreaterthan10.test(10));
        System.out.println(isEven.negate().test(10));
        System.out.println(isEven.negate().test(11));
    }
}