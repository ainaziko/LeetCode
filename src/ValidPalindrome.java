package neocoder.week3;

import java.util.Locale;
import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        solve();
        ValidPalindrome vp = new ValidPalindrome();

        System.out.println(vp.isPalindrome("0P"));
    }

    public static void solve(){
        Scanner in = new Scanner(System.in);
        String  s = in.nextLine().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        String tmp = sb.toString();
        boolean b = tmp.contentEquals(sb.reverse());
        System.out.println(b);
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("(?:-|[\\[\\]{}()@!#$%?^&*: ;`,_.'<>+\\\"\"/\\\\])", "");
        String s1 = new StringBuilder().reverse().toString();
        if(s1.equals(s)) return true;
        else return false;
    }

}