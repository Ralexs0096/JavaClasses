import java.util.Stack;
import java.util.function.BiPredicate;

public class StackClass {
    public static void main(String[] args) {
        String input = "([]){}"; // balanced

        var result = verifyIsBalanced(input);

        System.out.println("Is input balanced: " + result);
    }

    static boolean verifyIsBalanced(String input) {
        BiPredicate<Character, Character> isBalanced = (open, close) -> (open == '[' && close == ']') ||
                (open == '(' && close == ')') ||
                (open == '{' && close == '}');

        var stack = new Stack<Character>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                var top = stack.peek();
                if (isBalanced.test(top, c)) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

}
