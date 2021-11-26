import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return operate(s).equals(operate(t));
    }

    public String operate(String s){
        Stack<Character> ans = new Stack<>();
        for (char c: s.toCharArray()) {
            if(c !='#'){
                ans.push(c);
            }else if(!ans.isEmpty()){
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ab#c";
        BackspaceStringCompare b = new BackspaceStringCompare();
        b.backspaceCompare(s,t);
    }
}
