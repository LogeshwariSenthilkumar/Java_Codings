import java.util.*;

class Stack3 {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // For closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched pair
                }
            }
        }
        // Balanced if stack is empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mathematical Expression : ");
        String expr = sc.nextLine();

        if (isBalanced(expr)) {
            System.out.println("The expression has Balanced Parentheses ");
        } else {
            System.out.println("The expression has Unbalanced Parentheses ");
        }
    }
}
