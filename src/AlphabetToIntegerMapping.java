import java.util.HashMap;

public class AlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
    }
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 2 && s.charAt(i + 2) == '#'){
                String v = "";
                v += s.charAt(i);
                v += s.charAt(i + 1);
                sb.append((char)(Integer.parseInt(v) + 'a' - 1));
                i += 2;
            }else {
                sb.append((char)(s.charAt(i) - '0' + 'a' - 1));
            }
        }
        return sb.toString();
    }
}
