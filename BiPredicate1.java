import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.BiPredicate;

class BiPredicateLogin {
    public static void main(String[] args) {
        // BiPredicate takes two Strings: username and password
        BiPredicate<String, String> login = 
            (user, pass) -> user.equals("Admin") && pass.equals("12345");

        // Test with valid credentials
        if (login.test("Admin", "12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        // Test with invalid credentials
        if (login.test("User", "12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
