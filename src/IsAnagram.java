import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        IsAnagram is = new IsAnagram();
        System.out.println(is.isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t){
        boolean answer = false;
        if(s.length() != t.length()){
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        if(Arrays.equals(ss,tt)){
            answer = true;
        }
        return answer;
    }
}
