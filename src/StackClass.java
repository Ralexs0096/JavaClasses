import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        String input = "([])}"; // balanced

        var result = verifyIsBalanced(input);

        System.out.println("Is input balanced: " + result);
    }

    static boolean verifyIsBalanced(String input) {
        var stack = new Stack<Character>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                var top = stack.peek();
                System.out.println(top);
                if (isBalanced(top, c)) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    static boolean isBalanced(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
