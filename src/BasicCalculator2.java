import java.util.Stack;

public class BasicCalculator2 {


    public int calculate(String s) {

        if(s.isEmpty()) return 0;
        int len = s.length();
        int currNum = 0;
        char operation = '+';
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < len; i++){
            char currChar = s.charAt(i);

            if(Character.isDigit(currChar)){
                currNum = currNum*10 + (currChar - '0');
            }
            if(!Character.isDigit(currChar) && !Character.isWhitespace(currChar) || i == len - 1){
                if(operation == '-'){
                    stack.push(-currNum);
                }
                else if(operation == '+'){
                    stack.push(currNum);
                }
                else if(operation == '*'){
                    stack.push(stack.pop() * currNum);
                }
                else if(operation == '/'){
                    stack.push(stack.pop() / currNum);
                }
                currNum = 0;
                operation = '+';
            }
        }
        int res = 0;
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }


    public static void main(String[] args) {
        BasicCalculator2 calculator2 = new BasicCalculator2();
        calculator2.calculate("3+2*2");

    }
}
