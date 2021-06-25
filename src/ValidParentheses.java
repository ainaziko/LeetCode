import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for(int nextIndex = 1; nextIndex < s.length(); nextIndex++){
            char next = s.charAt(nextIndex);
            if(next == ')' && !stack.isEmpty() && stack.peek() == '(' || next == ']' && !stack.isEmpty() && stack.peek() == '[' || next == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else {
                stack.add(next);
            }
        }
        return stack.isEmpty();
    }
}
