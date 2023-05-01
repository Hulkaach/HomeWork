package S4.ex2;

import java.util.Stack;

public class ex2 {
    /**
     * () true
     * ()[]{} true
     * (] false
     * 
     * @param args
     */
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "()[]";
        System.out.println("Исходные данные: " + s);

        for (Character item : s.toCharArray()) {
            if (item == '(' || item == '{' || item == '[') {
                stack.push(item);
            } else if (item == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.push(item);
            else if (item == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.push(item);
            else if (item == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.push(item);
        }
        System.out.println("Стек: " + stack);
        if (stack.size() == s.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
