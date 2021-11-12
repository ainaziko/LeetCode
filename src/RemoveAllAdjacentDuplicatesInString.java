import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char curr = s.charAt(i);
            if(sb.length() >0 && sb.charAt(sb.length() - 1) == curr){
                sb.deleteCharAt(sb.length() - 1);
            }else {
                sb.append(curr);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString r = new RemoveAllAdjacentDuplicatesInString();
        r.removeDuplicates("aaaaaaaa");
    }

    public String removeDuplicates1(String s) {
        if(s.length() == 1) return s;
        String tmp = s;
        s = rm(s);

        while (!tmp.equals(s) || !s.isEmpty()){
            s = rm(s);
            tmp = s;
        }
        System.out.println(s + "!");
        return s;
    }

    public String rm(String s){
        for (int i = 0; i+1 < s.length(); i++){
            if(s.charAt(i) == s.charAt(i+1)){
                String ss = s.substring(0, i) + s.substring(i + 2);
                return ss;
            }
        }
        return s;
    }
}
