/*
Write a java program to evaluate a postfix expression using Stack.
 */

package Assignment2_A;
import java.util.Stack;

public class A2Q4 {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to integer and push onto the stack
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result;
                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "82+3*4-";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
}


/* OUTPUT*/
/*
Result: 26
 */

