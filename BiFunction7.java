import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

//OnlineShoppingCart:
class  Function8{
    public static void main(String[] args) {
        BiFunction<Double,Double,Double> total=(p,q)->(p*q);
        double pr=total.apply(5.0,50.0);
        Function<Double,Double> gst=(p)->p+(p*0.10);
        System.out.println(gst.apply(pr));
    }
}