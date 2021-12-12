import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == ']'){
                List<Character> list = new ArrayList<>();
                while (stack.peek() != '['){
                    list.add(stack.pop());
                }
                stack.pop();

                int k = 0;
                int base = 1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                while (k != 0){
                    for(int n = list.size() - 1; n >=0; n--){
                        stack.push(list.get(n));
                    }
                    k--;
                }
            }else {
                stack.push(curr);
            }
        }
        System.out.println(stack);
        char[] res = new char[stack.size()];

        for(int i = res.length - 1; i >= 0; i--){
            res[i] = stack.pop();
        }
        return new String(res);
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString(s));
    }
}
