package stack;

import java.util.Stack;

public class BaseballGame{
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String curr : ops) {
            switch (curr) {
                case "+" -> {
                    int x = stack.pop();
                    int y = x + stack.peek();
                    stack.push(x);
                    stack.push(y);
                }
                case "D" -> stack.push(stack.peek() * 2);
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(curr));
            }
        }
        int counter = 0;
        for(int score : stack) counter += score;
        return counter;
    }

    public static void main(String[] args) {
        String[] arr = {"5","-2","4","C","D","9","+","+"};
        BaseballGame b = new BaseballGame();
        System.out.println(b.calPoints(arr));
    }
}
