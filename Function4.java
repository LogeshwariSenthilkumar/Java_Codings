import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
//Employee Bonus:

class Function5{
    public static void main(String[] args) {
       Function<Double,Double> bonus=(n)->(n*0.15);
       System.out.println(bonus.apply(50000.0));
        System.out.println(bonus.apply(40000.0));

    }
}