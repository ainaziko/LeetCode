import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid1(String s){
        int bal = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            bal += s.charAt(i) == '(' ? 1 : -1;
            System.out.println(bal);
            if(bal == -1){
                ans++;
                bal++;
            }
        }
        return ans + bal;
    }
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char next = s.charAt(i);
            if(stack.isEmpty()){
                stack.add(next);
            }else {
                if(stack.peek().equals('(') && next == ')'){
                    stack.pop();
                }else {
                    stack.add(next);
                }
            }
        }
        return stack.size();
    }
}
