package logics;

import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expr = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    isBalanced = false;
                    break;
                }
            }
        }

        // Final check
        if (!stack.isEmpty()) {
            isBalanced = false;
        }

        if (isBalanced) {
            System.out.println("Brackets are balanced");
        } else {
            System.out.println("Brackets are not balanced");
        }
    }
}
