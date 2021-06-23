public class PalindromeNum {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(x + "");
        StringBuilder s = new StringBuilder(x + "");
        return sb.toString().equals(s.reverse().toString());
    }
}
/*
        StringBuilder sb = new StringBuilder();
        String s = x + "";
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s);
*/
