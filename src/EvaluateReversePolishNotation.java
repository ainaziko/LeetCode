import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){

            if(!"+-*/".contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }

            int y = stack.pop();
            int x = stack.pop();

            int res = switch (token) {
                case "+" -> x + y;
                case "-" -> x - y;
                case "*" -> x * y;
                case "/" -> x / y;
                default -> 0;
            };

            stack.push(res);

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "-11";
        int n = Integer.parseInt(s);
        System.out.println(n);
    }
}
