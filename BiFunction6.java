import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
//BankInterest:

class Function7{
    public static void main(String[] args) {
        BiFunction<Double,Double,Double> in=(n1,n2)->(n1*n2)/100;
        System.out.println(in.apply(10000.0,5.0));
    }
}