import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
//Shopping discount:
class BiPredicate2{
    public static void main(String[] args) {
        BiPredicate<Integer,String> con=(n1,n2)->(n1>5000 && n2.equals("Premium"));
        if(con.test(5500,"Premium")){
            System.out.println("Discount is provided");
        }
        else{
            System.out.println("Not Applicable for discount");
        }
        if(con.test(550,"Premium")){
            System.out.println("Discount is provided");
        }
        else{
            System.out.println("Not Applicable for discount");
        }
    }
}