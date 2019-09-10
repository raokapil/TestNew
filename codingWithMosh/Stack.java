package codingWithMosh;

public class Stack {
    public static void main(String[] args) {


        System.out.println("reverseStringUsingStack : " + reverseStringUsingStack("abcd"));

        System.out.println("isExpressionBalancedUsingStack : " + isExpressionBalancedUsingStack("(([1> + <2>))[a]"));

    }

    private static boolean isExpressionBalancedUsingStack(String s) {

        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '<') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '>'){
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if(
                        (ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '>' && top != '<')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static String reverseStringUsingStack(String str) {

        if (str == null)
            throw new IllegalArgumentException();

        java.util.Stack<Character> stack = new java.util.Stack();
        for (int i=0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuffer buffer = new StringBuffer();
        while (!stack.isEmpty()) {
            buffer.append(stack.pop());
        }
        return buffer.toString();
    }
}
