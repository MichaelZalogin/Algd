package javaCourseBlackBelt.collections.stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Michael");
        stack.push("Oleg");
        stack.push("Katya");
        stack.push("Petr");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}