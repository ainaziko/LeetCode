public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int bal = 0;
        int i = 0;
        String curr = "";

        while(i < s.length()){
            if(s.charAt(i) == '('){
                bal++;
            }else {
                bal--;
            }
            curr += String.valueOf(s.charAt(i));
            if(bal == 0){
                ans += curr.substring(1, curr.length()-1);
                bal = 0;
                curr = "";
            }
            i++;
        }
        return ans;
    }
}
