import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
//ProductPrice Calculation:

class Function6{
    public static void main(String[] args) {
        BiFunction<Integer,Double,Double> price=(q,p) ->(p*q);
        System.out.println(price.apply(5,5.0));
    }
}